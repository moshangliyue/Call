package com.call.project.Service;

import com.call.project.bean.Project;
import com.call.project.mapper.ProjectMapper;
import com.call.user.bean.User;
import com.call.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private UserMapper userMapper;
    @Override
    public boolean saveInfo(Project project) {
        int insert = projectMapper.insert(project);
        return insert>0;
    }

    @Override
    public int save(User user) {
      return   userMapper.insert(user);
    }
}
