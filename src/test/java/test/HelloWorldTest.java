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
    public void ignoredTest() {
        Assert.assertTrue(true);
    }
	
	@Ignore("this test should be ignored")
	@Test
    public void ignored1Test() {
        Assert.assertTrue(true);
    }
	
	@Ignore("this test should be ignored")
	@Test
    public void ignored2Test() {
        Assert.assertTrue(true);
    }
	
	@Ignore("this test should be ignored")
	@Test
    public void ignored3Test() {
        Assert.assertTrue(true);
    }

    @Test
    public void passed1Test() {
        Assert.assertTrue(true);
    }
	@Test
    public void passed2Test() {
        Assert.assertTrue(true);
    }
	@Test
    public void passed3Test() {
        Assert.assertTrue(true);
    }
	@Test
    public void passed4Test() {
        Assert.assertTrue(true);
    }
	@Test
    public void failedTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void thirdTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void fourthTest() {
        Assert.assertTrue(false);
    }

}
