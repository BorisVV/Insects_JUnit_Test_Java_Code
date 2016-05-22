package Test_Package;


import com.BorisV.java.Bee; //I could had imported this class as static to make it easy.
import org.junit.Assert;
import org.junit.Test;


public class BeeTest {

    //This two method verify that the set and get methods work fine, if I was to change something in the Bee Class then this will
    //these methods will throw errors.
    @Test
    public void getFavFlower() throws Exception {
        Bee.setFavFlower("Rose");
        Assert.assertEquals("Rose", Bee.getFavFlower(), "CHECK THE BEE CLASS");
        //On this code I added a message at the end, if the test throws an error
        //I can relate or find what method is causing it.
    }

    @Test
    public void setFavFlower() throws Exception {
        Bee.setFavFlower("Rose");
        Assert.assertEquals(Bee.getFavFlower(), "Rose");

    }

}