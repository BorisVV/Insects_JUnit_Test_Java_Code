package Test_Package;

import org.junit.Assert;
import org.junit.Test;

import static com.BorisV.java.Butterfly.*;

public class ButterflyTest {
    /*
        This code the color of the wings should be matching, if I was to change something in
        the method getWinColor, the test then will throw an error.
        For example the getWingColor(){return wingColor + "Orange"}
        That will cause the method test to throw an error because they don't match, telling me that
        something was change in the Butterfly class getWingColor method.
     */

    @Test
    public void getButterFlyColorTest() throws Exception {
        String color = "Blue and Yellow";
        setWingColor(color);
        Assert.assertEquals("Blue and Yellow", getWingColor());
        //This asserts that the code will do what is mean to do.
    }

}