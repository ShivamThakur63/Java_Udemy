package Concepts.Java08.Stream.Question;

/*
 * Suppose you have a list of employees, and each employee has multiple projects they have worked on. 
 * Each project has a name, duration (in months), and a list of tasks. 
 * Each task has a name and estimated hours to complete. 
 * You need to find the total estimated hours required to complete all the tasks across all projects for each employee.
 */
public class Task 
{

    String name;
    int duration ;

    
    public Task(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getDuration() {
        return duration;
    }


    @Override
    public String toString() {
        return "Task [name=" + name + ", duration=" + duration + "]";
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }
    

    
}
