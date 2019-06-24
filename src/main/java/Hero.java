import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String mName;
    private int mAge;
    private String mSpecialPower;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<>();
    private int mId;
    public Hero(String name,int age,String special_power,String weakness){
        mName=name;
        mAge = age;
        mSpecialPower =special_power;
        mWeakness = weakness;
        mId = instances.size();
    }
}
