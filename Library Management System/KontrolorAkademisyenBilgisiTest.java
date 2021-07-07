

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KontrolorAkademisyenBilgisiTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorAkademisyenBilgisiTest
{
    private KontrolorAkademisyenBilgisi kontrolo1;

    /**
     * Default constructor for test class KontrolorAkademisyenBilgisiTest
     */
    public KontrolorAkademisyenBilgisiTest()
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
        kontrolo1 = new KontrolorAkademisyenBilgisi();
        kontrolo1.UyeBilgileriKayıt(87654321, "testKontrolorAkademisyenBilgiAd", "testKontrolorAkademisyenBilgiSoyad");
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
    public void testKontrolorAkademisyenBilgi()
    {
        kontrolo1.UyeBilgileriKayıt(87654321, "testKontrolorAkademisyenBilgiAd", "testKontrolorAkademisyenBilgiSoyad");
    }
}

