import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int mMaxSize;
    private String mName;
    private String mCause;
    private static List<Squad> instances = new ArrayList<>();
    private int mId;
    private  List<Hero> mHeros;

    public List<Hero> getmHeros() {
        return mHeros;
    }

    public int getmId() {
        return mId;
    }

    public static List<Squad> getInstances() {
        return instances;
    }

    public String getmCause() {
        return mCause;
    }

    public String getmName() {
        return mName;
    }

    public int getmMaxSize() {
        return mMaxSize;
    }

    public Squad(String name, int max_size, String cause){
        mName= name;
        mMaxSize = max_size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeros = new ArrayList<>();
    }
}
