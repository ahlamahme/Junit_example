
/*In JUnit 5,
the tags @BeforeEach and @BeforeAll are the equivalents of @Before 
and @BeforeClass in JUnit 4.
Their names are a bit more indicative of when they run,
loosely interpreted: 'before each tests' and 'once before all tests*/
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gfgh
 */
public class NewClassTest {
    NewClassTest istant;
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public NewClassTest() {
    }

    @BeforeAll   //equal to before in junit4
    public static void init(){
        System.out.println("BeforeAll init() method called");
        NewClassTest istant = new NewClassTest();
    }

    @AfterAll   //equal to After in junit4
    public static void tearDownClass() throws Exception {
         System.out.println("AfterAll tearDownClass() method called");
    }

    @BeforeEach  // equal to beforeclass in junit4
     public void initEach(){
        System.out.println("BeforeEach initEach() method called");
    }
    @AfterEach   //equal to Afterclass in junit4
    public void tearDown() throws Exception {
        System.out.println("AfterEach tearDown() method called");
    }
 @Test
    public void testIs_odd()
    {
        System.out.println("done1");
        int n =3;
        
        boolean  ecpected = true;
        
        boolean  result  = istant.isOdd(n) ;
        assertEquals(ecpected,result );
    }
    @Test
    public void testIs_even()
    {
        System.out.println("done2");
        int n =4;
        NewClassTest istant = new NewClassTest();
        boolean  ecpected = true;
        
        boolean  result  = !(istant.isOdd(n)) ;
        assertEquals(ecpected,result );
    }
    
}
