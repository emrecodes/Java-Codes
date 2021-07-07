

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UyeModelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OgrenciModelTest
{
    private OgrenciModel uyeModel1;

    /**
     * Default constructor for test class UyeModelTest
     */
    public OgrenciModelTest()
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
        uyeModel1 = new OgrenciModel();
        uyeModel1.KayıtÖğrenci("TestsetöğrenciAd", "TestsetöğrenciSoyad", 12345678);
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
    public void TestsetöğrenciAd()
    {
        OgrenciModel uyeModel1 = new OgrenciModel();
        uyeModel1.setöğrenciAd("TestsetöğrenciAd");
        assertEquals("TestsetöğrenciAd", uyeModel1.getöğrenciAd());
    }

    @Test
    public void TestsetöğrenciSoyad()
    {
        OgrenciModel uyeModel1 = new OgrenciModel();
        uyeModel1.setöğrenciSoyad("TestsetöğrenciSoyad");
        assertEquals("TestsetöğrenciSoyad", uyeModel1.getöğrenciSoyad());
    }

    @Test
    public void TestsetöğrenciNo()
    {
        OgrenciModel uyeModel1 = new OgrenciModel();
        uyeModel1.setöğrenciNo(12345678);
        assertEquals(12345678, uyeModel1.getöğrenciNo());
    }
}



