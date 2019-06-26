
import java.util.ArrayList;


public class Squad {
    private int MaxSize;
    private String Name;
    private String Cause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private int Id;
    private  ArrayList<Hero> Heros;
    public Squad(String name, int max_size, String cause){
        this.Name= name;
        this.MaxSize = max_size;
        this.Cause = cause;
        instances.add(this);
        this.Id = instances.size();
        this.Heros = new ArrayList<>();
    }


    public int getId() {
        return Id;
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public String getCause()
    {
        return Cause;
    }

    public String getName()
    {
        return Name;
    }

    public int getMaxSize() {

        return MaxSize;
    }
   public static  Squad find (int id){

        return instances.get(id-1);
   }


    public ArrayList<Hero>getHeros(){

        return Heros;
    }
   public void addHero(Hero myHero){
       if(Heros.size()<MaxSize){
           Heros.add(myHero);
       }
   }
   public void removeHero(Hero myHero){
       Heros.remove(myHero);
    }


}
