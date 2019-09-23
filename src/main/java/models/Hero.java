package models;
import java.util.ArrayList;

public class Hero {
    private String Name;
    private String Power;
    private String Weakness;
    private Integer id;
    private static ArrayList<Hero>instances = new ArrayList<>();

    public Hero(String name,String power,String weakness){
        this.Name = name;
       this.Power = power;
        this. Weakness = weakness;
        instances.add(this);
        this. id = instances.size();
    }
    public String getName(){
        return Name;
    }
    public String getPower() {
        return Power;
    }
    public String getWeakness() {
        return Weakness;
    }
    public int getId() {
        return id;
    }
    public static Hero findById(int id){
        return instances.get(id-1);
    }
    public static ArrayList<Hero> all() {
        return instances;
    }
    public static void clear(){
        instances.clear();
    }
}
