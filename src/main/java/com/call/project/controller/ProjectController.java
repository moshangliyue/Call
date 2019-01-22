package com.call.project.controller;

import com.call.project.Service.ProjectService;
import com.call.project.bean.Project;

import org.apache.ibatis.annotations.Param;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;

import java.text.SimpleDateFormat;

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

}

