package com.call.project.controller;

import com.call.project.Service.ProjectService;
import com.call.project.bean.Project;

import com.call.project.bean.ProjectExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("/pro")
public class ProjectController {
    @Resource
    private ProjectService projectService;

    @RequestMapping("saveInfo")
    public String saveInfo(Project project, @Param("update") String update, @Param("downdate") String downdate) throws Exception {
        Project project1 = files(project, update, downdate);


        boolean b = projectService.saveInfo(project1);
        if(b){
            return "redirect:../houtai/main.jsp";
        }
        return "errey";
    }
    //查询所有项目展示
    @RequestMapping("selectsave")
    public String selectsave(@RequestParam(value="currpage",defaultValue="1")Integer currentPage, @RequestParam(value="pagesize",defaultValue="2") Integer size, HttpSession session){
        PageHelper.startPage(currentPage,size);
        List<Project> list = projectService.selectsave(null);
        for (Project pro:list) {
            pro.setPercent(percent(pro));
        }
        PageInfo<Project> pageInfo = new PageInfo<>(list);
        session.setAttribute("pi",pageInfo);
        return  "redirect:../houtai/project/list.jsp";
    }

    //查询未达标的项目
    @RequestMapping("updone")
    public String updone(@RequestParam(value="currpage",defaultValue="1")Integer currentPage, @RequestParam(value="pagesize",defaultValue="2") Integer size, HttpSession session){
        PageHelper.startPage(currentPage,size);
        List<Project> list=projectService.updone();
        for (int i=0;i<list.size();i++){
            list.get(i).setPercent(percent(list.get(i)));

        }

        PageInfo<Project> pageInfo = new PageInfo<>(list);
        session.setAttribute("pi",pageInfo);
        return "redirect:../houtai/project/listFail.jsp";
     }
     //修改项目时数据展示
     //查询所有项目展示s
     @RequestMapping("selectBypid")
     public String selectBypids(Integer pid,HttpSession session){
         ProjectExample pe = new ProjectExample();
         ProjectExample.Criteria cc = pe.createCriteria();
         cc.andPidEqualTo(pid);
         List<Project> list = projectService.selectsave(pe);
         System.out.println(list.get(0));
        session.setAttribute("project",list.get(0));

         return  "redirect:../houtai/project/edit.jsp";
     }

    //修改项目
    @RequestMapping("updateBypid")
    public String updateBypid(Project project, @Param("update") String update, @Param("downdate") String downdate)throws Exception{
        Project project1 = files(project,update,downdate);
        boolean update1 = projectService.update(project1);
        if(update1){
            return  "redirect:../houtai/main.jsp";
        }
        return "errey";

    }
    //关键字查找
    @RequestMapping("selectByname")
    @ResponseBody
    public List<Project> selectByname(String pname){
        ProjectExample pe = new ProjectExample();
        ProjectExample.Criteria cc = pe.createCriteria();
        cc.andPnameLike("%"+pname+"%");
        List<Project> list = projectService.selectsave(pe);

        return list;

    }



//计算完成比例
     public int percent(Project pro){
             int a = pro.getGeton().getGing();
             int b=pro.getPamount();
             double sss= (double)a/b*100;
            return (int)Math.floor(sss);
     }


    //处理文件上传的的方法
    public Project files(Project project, @Param("update") String update, @Param("downdate") String downdate)throws Exception{

            //时间转换器
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            project.setPstart(sdf.parse(update));
            project.setPend(sdf.parse(downdate));
            //保存数据库的路径
            String sqlPath = null;
            //定义文件保存的本地路径
            String localPath = "D:\\File\\";
            //定义 文件名
            String filename = null;
            if(!project.getFile().isEmpty()){
                //生成uuid作为文件名称
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                //获得文件类型（可以判断如果不是图片，禁止上传）
                String contentType=project.getFile().getContentType();
                //获得文件后缀名
                String suffixName=contentType.substring(contentType.indexOf("/")+1);
                //            //得到 文件名
                filename=uuid+"."+suffixName;
                System.out.println(filename);
                //文件保存路径
                project.getFile().transferTo(new File(localPath+filename));
            }
            //把图片的相对路径保存至数据库
            sqlPath = "/images/"+filename;
            project.setPimg(sqlPath);

       return project;
    }
}

