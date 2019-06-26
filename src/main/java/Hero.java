import java.time.LocalDateTime;
import java.util.ArrayList;


public class Hero {
    private String name;
    private int age;
    private String special_power;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero(String name, int age, String special_power, String weakness){
        this.name=name;
        this.age = age;
        this.special_power =special_power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }

    public String getWeakness() {

        return weakness;
    }

    public String getSpecialPower(){
        return special_power;
    }

    public int getAge() {

        return this.age;
    }
    public static void clear(){
        instances.clear();
    }
    public static Hero find(int id){
        return instances.get(id-1);
    }
    public static void remove(int id){
        instances.remove(id-1);
    }


}
