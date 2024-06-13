package Concepts.Java08.Stream.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Suppose you have a list of employees, and each employee has multiple projects they have worked on. 
 * Each project has a name, duration (in months), and a list of tasks. 
 * Each task has a name and estimated hours to complete. 
 * You need to find the total estimated hours required to complete all the tasks across all projects for each employee.
 */
public class Employee {

    String name;
    List<Project> listOfProject;

    public Employee(String name, List<Project> listOfProject) {
        this.name = name;
        this.listOfProject = listOfProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getListOfProject() {
        return listOfProject;
    }

    public void setListOfProject(List<Project> listOfProject) {
        this.listOfProject = listOfProject;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", listOfProject=" + listOfProject + "]";
    }

    public static void main(String[] args) {

        Task task1 = new Task("Task1", 3);
        Task task2 = new Task("Task2", 4);
        Task task3 = new Task("Task3", 6);
        Task task4 = new Task("Task4", 10);
        Task task5 = new Task("Task5", 13);
        Task task6 = new Task("Task6", 2);
        Task task7 = new Task("Task7", 11);
        Task task8 = new Task("Task8", 7);
        Task task9 = new Task("Task9", 5);
        Task task10 = new Task("Task10", 2);
        Task task11 = new Task("Task11", 2);

        Project project1 = new Project("Project1", 2, Arrays.asList(task1, task2));
        Project project2 = new Project("Project2", 6, Arrays.asList(task3, task4, task5, task6, task7));
        Project project3 = new Project("Project3", 4, Arrays.asList(task8, task9, task10));
        Project project4 = new Project("Project4", 4, Arrays.asList(task11));

        Employee employee1 = new Employee("Shivam Thakur    ", Arrays.asList(project1, project2));
        Employee employee2 = new Employee("Pushkar Sah      ", Arrays.asList(project3, project4));
        Employee employee3 = new Employee("Binayak Prajapti ", Arrays.asList(project4));
        Employee employee4 = new Employee("Sandesh Pandey   ", new ArrayList<>());

        System.out.println("\n\n" + "--".repeat(10) + " First Employee " + "--".repeat(10) + "\n");

        TotalTimeNeededToCompleteTask(employee1);

        System.out.println("\n" + "--".repeat(10) + " Second Employee " + "--".repeat(10) + "\n");

        TotalTimeNeededToCompleteTask(employee2);

        System.out.println("\n" + "--".repeat(10) + " Third Employee " + "--".repeat(10) + "\n");

        TotalTimeNeededToCompleteTask(employee3);

        System.out.println("\n");

        // Calculate the count of tasks in each category for each employee
        Map<String, Long> tasksByCategoryEmployee1 = employee1.countTasksByCategory();
        Map<String, Long> tasksByCategoryEmployee2 = employee2.countTasksByCategory();
        Map<String, Long> tasksByCategoryEmployee3 = employee3.countTasksByCategory();

        // Print the results
        System.out.println("Employee 1: " + tasksByCategoryEmployee1);
        System.out.println("Employee 2: " + tasksByCategoryEmployee2);
        System.out.println("Employee 3: " + tasksByCategoryEmployee3);

        // System.out.println(employee1.getListOfProject().stream().map(Project -> Project.getListOfTask().stream()).collect(Collectors.toList()));
        System.out.println("--".repeat(20));

        employee1.getProjectTime();
        System.out.println("--".repeat(20));
        employee2.getProjectTime();

        System.out.println();
        employee2.getHighestTimeTakingProject();
        employee4.getHighestTimeTakingProject();
        System.out.println("--".repeat(20));
        employee1.TotalTimeNeededToCompleteTask();
    
    }

    private static void TotalTimeNeededToCompleteTask(Employee employee) {

        int[] EmployeeTimeArray = employee.getListOfProject().stream()
                .flatMap(Project -> Project.getListOfTask().stream()).mapToInt(Task -> Task.getDuration()).toArray();
        int EmployeeTime = employee.getListOfProject().stream().flatMap(Project -> Project.getListOfTask().stream())
                .mapToInt(Task -> Task.getDuration()).sum();

        System.out.println("List Of Time Taken Individually : " + Arrays.toString(EmployeeTimeArray));
        System.out.println(("Total Time Needed : " + EmployeeTime));

        


    }


    private Map<String,Long> countTasksByCategory()
    {

        return getListOfProject().stream().flatMap(Project -> Project.getListOfTask().stream()).collect(Collectors.groupingBy(task -> {
        int duration = (int)((Task) task).getDuration();
            if(duration <= 5 ){
            return "Low";
            }else if(duration <= 10 )
            {
                return "Average";
            }
            else{
                return "High";
            }
        }
        , Collectors.counting()));
    }

    // The total estimated hours required to complete all tasks in each project for each employee.

    private void  getProjectTime()
    {
        List<Project> projectTime = getListOfProject().stream().collect(Collectors.toList());
        
        projectTime.forEach(task -> 
        {
           int timeTaken = task.getListOfTask().stream().mapToInt(ask -> ask.getDuration()).sum();

            System.out.println("Employee: " + getName() + ", Project: " + task.getName() +
            ", Total Time Needed: " + timeTaken);
        });
        
    }

    private void getHighestTimeTakingProject() 
    {
        List<Project> projectList = getListOfProject().stream().collect(Collectors.toList());
        int min = 0;
        int max = 0;
        String leastTimeTakingProject  = null ;
        String mostTimeTakingProject  = null ;


        if(projectList.isEmpty())
        {
            System.out.println("\nNo Projects Found in the List");
            return;
        }        

        for (Project project : projectList) {
            int sum = project.getListOfTask().stream().mapToInt(Task :: getDuration).sum();
            int temp = 0;


            if(sum > max)
            {
                temp = max;
                max = sum;
                min = temp;
                mostTimeTakingProject = project.getName();
            }
            else if( sum < max)
            {
                min = sum;
                leastTimeTakingProject = project.getName();
            }
            
        }
        System.out.println("--".repeat(8)+" Project Summary "+"--".repeat(8)+"\n");
        System.out.println("Most Time Taking Project   : "+mostTimeTakingProject+"\nTime Consumed : " + max);
        System.out.println("--".repeat(20));
        System.out.println("Least Time Taking Project  : "+leastTimeTakingProject+"\nTime Consumed : " + min );
    }


    private void TotalTimeNeededToCompleteTask()
    {
        Map<String,List<Task>> a = getListOfProject().stream().flatMap(Project -> Project.getListOfTask().stream()).collect(Collectors.groupingBy(task -> {
            int duration = (int)((Task) task).getDuration();
                if(duration <= 5 ){
                return "Low";
                }else if(duration <= 10 )
                {
                    return "Average";
                }
                else{
                    return "High";
                }
            }
            , Collectors.toList()));


            System.out.println(a);
        }
    

}
