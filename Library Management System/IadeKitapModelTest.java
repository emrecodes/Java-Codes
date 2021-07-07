

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IadeKitapModelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IadeKitapModelTest
{
    private IadeKitapModel iadeKita1;

    /**
     * Default constructor for test class IadeKitapModelTest
     */
    public IadeKitapModelTest()
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
        iadeKita1 = new IadeKitapModel();
        iadeKita1.IadeKayit(12345678, "TestsetKitapAd");
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
        IadeKitapModel iadeKita1 = new IadeKitapModel();
        iadeKita1.setKitapAd("TestsetKitapAd");
        assertEquals("TestsetKitapAd", iadeKita1.getKitapAd());
    }

    @Test
    public void TestsetogrenciNo()
    {
        IadeKitapModel iadeKita1 = new IadeKitapModel();
        iadeKita1.setogrenciNo(12345678);
        assertEquals(12345678, iadeKita1.getogrenciNo());
    }
}


