package dao;

import entity.Project;

import java.util.List;

public interface ProjectDAO {

    //create
    void add(Project project);

    //update
    void update(Project project);

    //read
    Project getById(Long id);

    List<Project> getAll();

    //delete
    void remove(Project project);
}
