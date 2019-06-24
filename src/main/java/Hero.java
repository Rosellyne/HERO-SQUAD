import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String mName;
    private int mAge;
    private String mSpecialPower;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<>();
    private int mId;

    public String getmName() {
        return mName;
    }

    public int getmId() {
        return mId;
    }

    public static List<Hero> getInstances() {
        return instances;
    }

    public String getmWeakness() {
        return mWeakness;
    }

    public String getmSpecialPower() {
        return mSpecialPower;
    }

    public int getmAge() {
        return mAge;
    }

    public Hero(String name, int age, String special_power, String weakness){
        mName=name;
        mAge = age;
        mSpecialPower =special_power;
        mWeakness = weakness;
        mId = instances.size();
        instances.add(this);
    }
}
