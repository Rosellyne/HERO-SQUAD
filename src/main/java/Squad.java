
import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int mMaxSize;
    private String mName;
    private String mCause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private int mId;
    private  List<Hero> mHeros;
    public Squad(String name, int max_size, String cause){
        mName= name;
        mMaxSize = max_size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeros = new ArrayList<>();
    }

    public List<Hero> getmHeros() {
        return mHeros;
    }

    public int getmId() {
        return mId;
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public String getmCause()
    {
        return mCause;
    }

    public String getmName()
    {
        return mName;
    }

    public int getmMaxSize() {

        return mMaxSize;
    }
    public static void clear(){

        instances.clear();
    }
//    public static void  Squad find(int id){
//
//        return instances.get(id-1);
//    }
//    public static void remove(int id){
//        instances.remove(id-1);
//        for (Squad squad:instances){
//            squad.mId =instances.indexOf(squad)+1;
//        }
//    }
//    public ArrayList<Hero>getHeros(){
//
//        return mHeros;
//    }
//    public void addHero(Hero myHero){
//        if(mHeros.size()<mMaxSize){
//            mHeros.add(myHero);
//        }
//    }
//    public void removeHero(Hero myHero){
//        mHeros.remove(myHero);
//    }


}
