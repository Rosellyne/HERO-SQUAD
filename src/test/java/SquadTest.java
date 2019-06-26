import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals(true, mySquad instanceof Squad);
    }

    @Test
    public void Squad_instantiatesWithName_String() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals("Changers", mySquad.getName());

    }

    @Test
    public void Squad_instantiatesWithMaxSize_int() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals(9, mySquad.getMaxSize());
    }

    @Test
    public void Squad_instantiatesWithCause_String() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals("Fighting", mySquad.getCause());

    }

    @Test
    public void getAll_returnsAllInstancesOfSquad_true() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals(true, Squad.getAll().contains(mySquad));

    }


    @Test
   public void find_returnsInstanceOfSquadWithParticularId_Squad() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
         assertEquals(mySquad, Squad.find(mySquad.getId()));
 }

    @Test
    public void addHeros__addsHeroInstanceToSquad_true() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        mySquad.addHero(Hero.find (myHero.getId()));
        assertTrue( mySquad.getHeros().contains(myHero));
    }
    @Test
    public void addHeros__cannotAddMoreThanItsMaxSize_false() {
        Hero myHero = new Hero("Mary", 19, "Magician", "Lying");
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        mySquad.addHero(Hero.find(myHero.getId()));
        assertTrue( mySquad.getHeros().contains(myHero));
    }



}



