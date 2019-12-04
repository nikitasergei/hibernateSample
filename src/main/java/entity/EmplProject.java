//package entity;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.util.Objects;
//
//
//@Entity
//@Getter
//@Setter
//@Table(name = "empl_projects")
//public class EmplProject {
//
//    private Long employeeId;
//    private Long projectId;
//
//    public EmplProject() {
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmplProject that = (EmplProject) o;
//        return Objects.equals(employeeId, that.employeeId) &&
//                Objects.equals(projectId, that.projectId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(employeeId, projectId);
//    }
//
//    @Override
//    public String toString() {
//        return "EmplProject{" +
//                "employeeId=" + employeeId +
//                ", projectId=" + projectId +
//                '}';
//    }
//}
