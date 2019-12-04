package service;

import businesLogic.SessionUtil;
import dao.ProjectDAO;
import entity.Project;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProjectService extends SessionUtil implements ProjectDAO {

    @Override
    public void add(Project project) {
        openTransactionSession();

        Session session = getSession();
        session.save(project);

        closeTransactionSession();
    }

    @Override
    public void update(Project project) {
        openTransactionSession();
        Session session = getSession();
        session.update(project);

        closeTransactionSession();
    }

    @Override
    public Project getById(Long id) {
        openTransactionSession();
        String sql = "SELECT * FROM project WHERE ID= :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Project.class);
        query.setParameter("id", id);

        Project project = (Project) query.getSingleResult();
        closeTransactionSession();

        return project;
    }

    @Override
    public List<Project> getAll() {
        openTransactionSession();

        String sql = "SELECT * FROM project";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Project.class);
        List projectsList = query.list();

        closeTransactionSession();
        return projectsList;
    }

    @Override
    public void remove(Project project) {
        openTransactionSession();
        Session session = getSession();
        session.remove(project);
        closeTransactionSession();
    }
}
