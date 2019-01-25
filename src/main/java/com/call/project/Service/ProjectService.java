package com.call.project.Service;

import com.call.project.bean.Project;
import com.call.project.bean.ProjectExample;
import com.call.user.bean.User;

import java.util.List;

public interface ProjectService {
    public boolean saveInfo(Project project);


   public List<Project> selectsave(ProjectExample pe);

    public List<Project> updone();

    public boolean update(Project project);
}
