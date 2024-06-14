package Concepts.Java08.Stream.MapVFlatMap;

import java.util.List;


// Suppose we want to fetch all the city in Which our employee has worked so we can open up branch in that city.

public class Employee 
{
    private int id ;
    private String name;
    private List<String> citiesWorkedIn ;


    public Employee(int id, String name, List<String> citiesWorkedIn) {
        this.id = id;
        this.name = name;
        this.citiesWorkedIn = citiesWorkedIn;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<String> getCitiesWorkedIn() {
        return citiesWorkedIn;
    }


    public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
        this.citiesWorkedIn = citiesWorkedIn;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", citiesWorkedIn=" + citiesWorkedIn + "]";
    }

    

    

    

    
}
