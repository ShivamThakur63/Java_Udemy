package Concepts.Java08.Stream.Question;

import java.util.List;

/*
 * Suppose you have a list of employees, and each employee has multiple projects they have worked on. 
 * Each project has a name, duration (in months), and a list of tasks. 
 * Each task has a name and estimated hours to complete. 
 * You need to find the total estimated hours required to complete all the tasks across all projects for each employee.


 */
public class Project 
{

    String name ;
    int durationMonth ;
    List<Task> listOfTask;
    
    public Project(String name, int durationMonth, List<Task> listOfTask) {
        this.name = name;
        this.durationMonth = durationMonth;
        this.listOfTask = listOfTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMonth() {
        return durationMonth;
    }

    public void setDurationMonth(int durationMonth) {
        this.durationMonth = durationMonth;
    }

    public List<Task> getListOfTask() {
        return listOfTask;
    }

    public void setListOfTask(List<Task> listOfTask) {
        this.listOfTask = listOfTask;
    }

    @Override
    public String toString() {
        return "Project [name=" + name + ", durationMonth=" + durationMonth + ", listOfTask=" + listOfTask + "]";
    }

    
}
