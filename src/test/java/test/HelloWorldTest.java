/**
 * 
 */

package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * @author a
 * 
 */
public class HelloWorldTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {}

    @Ignore("this test should be ignored")
	@Test
    public void firstTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void thirdTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void fourthTest() {
        Assert.assertTrue(true);
    }

}
