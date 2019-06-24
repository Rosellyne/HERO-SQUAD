import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero myHero =new Hero("Mary",19,"Magician","Lying");
        assertEquals(true,myHero instanceof Hero);
    }

}