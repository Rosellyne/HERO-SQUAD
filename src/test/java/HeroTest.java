import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithName_String() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals("Mary", myHero.getName());
    }

    @Test
    public void Hero_instantiatesWithAge_int() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals(19, myHero.getAge());
    }

    @Test
    public void Hero_instantiatesWithSpecialPower_String() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals("Magician", myHero.getSpecialPower());
    }

    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals("Lying", myHero.getWeakness());
    }

    @Test
    public void getCreatedAt_instantiatesWithCurrentTime_today() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getCreatedAt().getDayOfWeek());
    }

    @Test
    public void clear_clearsAllInstancesOfHero_int() {
        Hero.clear();
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals(0, Hero.getAll().size());

    }

    @Test
    public void getAll_ReturnsAllInstancesOfHero_true() {
        Hero.clear();
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertTrue(Hero.getAll().contains(myHero));
    }

    @Test
    public void getmId_instantiatesWithId_int() {
        Hero.clear();
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        assertEquals(1, myHero.getId());

    }

    @Test
    public void remove_removesHeroWithParticularId_false() {
        Hero.clear();
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        Hero.remove(myHero.getId());
        assertFalse( Hero.getAll().contains(myHero));

    }
}