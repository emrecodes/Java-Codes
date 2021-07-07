

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OduncKitapModelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OduncKitapModelTest
{
    private OduncKitapModel oduncKit1;

    /**
     * Default constructor for test class OduncKitapModelTest
     */
    public OduncKitapModelTest()
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
        oduncKit1 = new OduncKitapModel();
        oduncKit1.OduncKayit(12345678, "TestsetKitapAd");
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
    public void TestsetKitapAd()
    {
        OduncKitapModel oduncKit1 = new OduncKitapModel();
        oduncKit1.setKitapAd("TestsetKitapAd");
        assertEquals("TestsetKitapAd", oduncKit1.getKitapAd());
    }

    @Test
    public void TestsetogrenciNo()
    {
        OduncKitapModel oduncKit1 = new OduncKitapModel();
        oduncKit1.setogrenciNo(12345678);
        assertEquals(12345678, oduncKit1.getogrenciNo());
    }
}


