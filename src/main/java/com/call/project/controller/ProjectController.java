package com.call.project.controller;

import com.call.project.Service.ProjectService;
import com.call.project.bean.Project;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("/pro")
public class ProjectController {
    @Resource
    private ProjectService projectService;

    @RequestMapping("saveInfo")
    public String saveInfo(Project project, @Param("update") String update, @Param("downdate") String downdate) throws Exception {

        System.out.println(project);
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        project.setPstart(sdf.parse(update));
        project.setPend(sdf.parse(downdate));
        System.out.println(project);

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
        System.out.println(project);

        System.out.println("controller已经执行");

        boolean b = projectService.saveInfo(project);
        if(b){
            return "redirect:../houtai/main.jsp";
        }
        return "errey";
    }
    //查询所有项目展示
    @RequestMapping("selectsave")
    public String selectsave(@RequestParam(value="currpage",defaultValue="1")Integer currentPage, @RequestParam(value="pagesize",defaultValue="2") Integer size, HttpSession session){
        PageHelper.startPage(currentPage,size);
        List<Project> list = projectService.selectsave();
        for (Project pro:list) {
            int a = pro.getGeton().getGing();
            int b=pro.getPamount();
           double sss= (double)a/b*100;
           pro.setPercent((int)Math.floor(sss));
        }
        PageInfo<Project> pageInfo = new PageInfo<>(list);
        session.setAttribute("pi",pageInfo);
        return  "redirect:../houtai/project/list.jsp";
    }

    //查询未达标的项目
    @RequestMapping("updone")
    @ResponseBody
    public List<Project> updone(){
        List<Project> selectsave = projectService.selectsave();
        //项目结束时间超时并且完成比例不足100%


        for (int i=0;i<selectsave.size();i++){
            Project pro = selectsave.get(i);
            int bili =(int)Math.floor(pro.getGeton().getGing()/pro.getPamount());
            if((pro.getPend()).before(new Date())){
                    if(bili>=1){
                        selectsave.remove(i);
                        i--;
                    }
            }else {
                selectsave.remove(i);
                i--;
            }
        }
        return selectsave;
     }
}

