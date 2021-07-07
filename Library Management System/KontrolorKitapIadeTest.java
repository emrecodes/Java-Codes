

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KontrolorKitapIadeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorKitapIadeTest
{
    private KontrolorKitapIade kontrolo1;

    /**
     * Default constructor for test class KontrolorKitapIadeTest
     */
    public KontrolorKitapIadeTest()
    {
        
    }
    @Before
    public void setUp()
    {
        kontrolo1 = new KontrolorKitapIade();
        kontrolo1.KitapIade(12345678, "TestKontrolorKitapIade");
    }
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestKontrolorKitapIade()
    {
        kontrolo1.KitapIade(12345678, "TestKontrolorKitapIade");
    }
}

