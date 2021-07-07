

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KontrolorUyeBilgisiTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorOgrenciBilgisiTest
{
    private KontrolorOgrenciBilgisi kontrolo1;

    /**
     * Default constructor for test class KontrolorUyeBilgisiTest
     */
    public KontrolorOgrenciBilgisiTest()
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
        kontrolo1 = new KontrolorOgrenciBilgisi();
        kontrolo1.UyeBilgileriKayıt(12345678, "TestKontrolorUyeBilgisiAd", "TestKontrolorUyeBilgisiSoyad");
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
    public void TestKontrolorOgrenciBilgisi()
    {
        kontrolo1.UyeBilgileriKayıt(12345678, "TestKontrolorUyeBilgisiAd", "TestKontrolorUyeBilgisiSoyad");
    }
}

