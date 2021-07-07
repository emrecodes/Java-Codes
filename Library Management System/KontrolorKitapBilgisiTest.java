

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KontrolorKitapBilgisiTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorKitapBilgisiTest
{
    private KitapModel kitapMod1;
    private KontrolorKitapBilgisi kontrolo1;

    /**
     * Default constructor for test class KontrolorKitapBilgisiTest
     */
    public KontrolorKitapBilgisiTest()
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
        kontrolo1 = new KontrolorKitapBilgisi();
        kontrolo1.KitapBilgileriKayit(01012020, "TestsetKitapAd", "TestsetKitapYazar", "TestsetKitapTür");
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
    public void TestKontrolorKitapBilgisi()
    {
        kontrolo1.KitapBilgileriKayit(01012020, "TestsetKitapAd", "TestsetKitapYazar", "TestsetKitapTür");
    }
}

