import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero myHero =new Hero("Mary",19,"Magician","Lying");
        assertEquals(true,myHero instanceof Hero);
    }
    @Test
    public void Hero_instantiatesWithName_String(){
        Hero myHero =new Hero("Mary",19,"Magician","Lying");
        assertEquals("Mary",myHero.getmName());
    }
    @Test
    public void Hero_instantiatesWithAge_int(){
        Hero myHero =new Hero("Mary",19,"Magician","Lying");
        assertEquals(19,myHero.getmAge());
    }

    @Test
    public void Hero_instantiatesWithSpecialPower_String(){
        Hero myHero =new Hero("Mary",19,"Magician","Lying");
        assertEquals("Magician",myHero.getmSpecialPower());
    }

    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals("Lying", myHero.getmWeakness());
    }


}