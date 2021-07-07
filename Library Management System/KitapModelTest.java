

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KitapModelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KitapModelTest
{
    private KitapModel kitapMod1;

    /**
     * Default constructor for test class KitapModelTest
     */
    public KitapModelTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kitapMod1 = new KitapModel();
        kitapMod1.KayıtKitap("TestsetKitapAd", "TestsetKitapYazar", "TestsetKitapTür", 01012020);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void setKitapAd()
    {
        KitapModel kitapMod1 = new KitapModel();
        kitapMod1.setKitapAd("TestsetKitapAd");
        assertEquals("TestsetKitapAd", kitapMod1.getKitapAd());
    }

    @Test
    public void setKitapYazar()
    {
        KitapModel kitapMod1 = new KitapModel();
        kitapMod1.setKitapYazar("TestsetKitapYazar");
        assertEquals("TestsetKitapYazar", kitapMod1.getKitapYazar());
    }

    @Test
    public void setKitapTür()
    {
        KitapModel kitapMod1 = new KitapModel();
        kitapMod1.setKitapTür("TestsetKitapTür");
        assertEquals("TestsetKitapTür", kitapMod1.getKitaptür());
    }

    @Test
    public void setKitapBasım()
    {
        KitapModel kitapMod1 = new KitapModel();
        kitapMod1.setKitapBasım(01012020);
        assertEquals(01012020, kitapMod1.getkitapbasim());
    }
}




