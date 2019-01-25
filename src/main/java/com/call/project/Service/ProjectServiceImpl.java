package com.call.project.Service;

import com.call.geton.mapper.GetonMapper;
import com.call.project.bean.Project;
import com.call.project.bean.ProjectExample;
import com.call.project.mapper.ProjectMapper;
import com.call.user.bean.User;
import com.call.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private GetonMapper getonMapper;
//查询所有
    @Override
    public boolean saveInfo(Project project) {
        int insert = projectMapper.insert(project);
        return insert>0;
    }
//所有项目
    @Override
    public List<Project> selectsave(ProjectExample pe) {

        List<Project> list = projectMapper.selectByExample(pe);
        for (Project pro: list) {
            pro.setGeton(getonMapper.selectByPid(pro.getPid()));
        }
        return list;
    }
//失败的的项目
    @Override
    public List<Project> updone() {

        List<Project> list = projectMapper.selectDateAndpercent(new Date());
        for (Project pro:list) {
            pro.setGeton(getonMapper.selectByPid(pro.getPid()));
        }
        return list;
    }

    @Override
    public boolean update(Project project) {

        int i = projectMapper.updateByPrimaryKey(project);

        return i>0;
    }
}
