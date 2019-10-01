package examples.aaronhoskins.com.unittestingdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListTest {
    CustomList testList;
    @Before
    public void setup() {
        testList = new CustomList();
    }


    @Test
    public void testIsEmptyReturnsTrue() {
        Assert.assertTrue(testList.isEmpty());
    }

    @Test
    public void testIsEmptyReturnsFalse(){
        testList.insert("Some String");
        Assert.assertFalse(testList.isEmpty());
    }
}
