package models;
import java.util.ArrayList;

//need multiple model classes so we need observer and subject classes
public abstract class Subject{

    ArrayList <Observer> observers = new ArrayList();

    public void attach(Observer){
        this.observers.add(o);
    }

    public void dettach(Observer){
        this.observers.remove(o);
    }

    public void Notify(){
        for(Observer o ; observers){
            o.update();
        }
    }

}