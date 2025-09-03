package Digiaccel;



import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testValidEmail() {
        Assert.assertTrue(Utils.isValidEmail("test@example.com"));
    }

    @Test
    public void testInvalidEmail() {
        Assert.assertFalse(Utils.isValidEmail("abc@"));
    }

    @Test
    public void testNullEmail() {
        Assert.assertFalse(Utils.isValidEmail(null));
    }
}

