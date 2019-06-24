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
        assertEquals("Changers", mySquad.getmName());

    }

    @Test
    public void Squad_instantiatesWithMaxSize_int() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals(9, mySquad.getmMaxSize());
    }
    @Test
    public void Squad_instantiatesWithCause_String() {
        Squad mySquad = new Squad("Changers", 9, "Fighting");
        assertEquals("Fighting", mySquad.getmCause());

    }
//    @Test
//    public void Squad_returnsAllInstancesOfSquad_true() {
//        Squad mySquad = new Squad("Changers", 9, "Fighting");
//        assertEquals(true, Squad.all());

    }


