

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KontrolorKitapOduncTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorKitapOduncTest
{
    private KontrolorKitapOdunc kontrolo1;

    /**
     * Default constructor for test class KontrolorKitapOduncTest
     */
    public KontrolorKitapOduncTest()
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
        kontrolo1 = new KontrolorKitapOdunc();
        kontrolo1.KitapOdunc(12345678, "TestKontrolorKitapOduncAd");
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
    public void TestKontrolorKitapOdunc()
    {
        kontrolo1.KitapOdunc(12345678, "TestKontrolorKitapOduncAd");
    }
}

