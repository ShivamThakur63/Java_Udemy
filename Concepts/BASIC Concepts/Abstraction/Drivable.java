package Abstraction;
interface Drivable 
{
    public void start();
    public void accelerate();
    public void brake();
    public void stop();
}
interface Flyable extends Drivable
{
    void fly();
}
interface Loadable
{

    // public final abstract void load()
    public abstract void load();
    
}