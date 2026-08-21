package anand.java8;
import java.util.List;

public class Project {

    private int projectId;
    private String projectName;
    private List<String> technologies;
    private String client;
    private double projectBudget;

    public Project(int projectId, String projectName, List<String> technologies, String client, double projectBudget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.technologies = technologies;
        this.client = client;
        this.projectBudget = projectBudget;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", technologies=" + technologies +
                ", client='" + client + '\'' +
                ", projectBudget=" + projectBudget +
                '}';
    }
}