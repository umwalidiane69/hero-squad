package models;
import java.util.ArrayList;

public class Squad {
    private String sizeName;
    private String sizeCause;
    private Integer id;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();
    private ArrayList<Hero> sizeHeroes;
    public Squad(String name,String cause){
        sizeName = name;
        sizeCause = cause;
        instances.add(this);
       id = instances.size();
    }
    public String getName(){
        return sizeName;
    }
    public String getCause() {
        return sizeCause;
    }
    public int getId() {
        return id;
    }
    public static Squad findById(int id){
        return instances.get(id-1);
    }
    public static ArrayList<Squad> all() {
        return instances;
    }
}
