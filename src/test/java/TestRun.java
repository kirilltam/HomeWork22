
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class TestRun {

   private static int numberOne = 2;
   private static int numberTwo = 4;
    @BeforeAll
    static void setUp(){
        numberOne += 1;
    }

    @Test
    public void positiveTest() {
        Assert.assertEquals(numberOne,numberTwo);
    }

    @Test
    public void negativeTest(){

        Assert.assertEquals(numberOne + 5, numberTwo);

    }
    @Test
    public void negativeTest2() {
        Assert.assertTrue( numberOne > numberTwo);
    }

    @AfterEach
    public void tearDown() {
        numberTwo -= 1;

    }




}

