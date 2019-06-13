package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    //happy path
    @Test
    public void test_happyPath() {
        MultiBracketValidation instance = new MultiBracketValidation();
        assertTrue(instance.multiBracketValidation("()"));
    }

    //have charactor inside of bracket
    @Test
    public void test_charactorInside() {
        MultiBracketValidation instance = new MultiBracketValidation();
        assertTrue(instance.multiBracketValidation("()[[Extra Characters]]"));
    }

    //bad example
    @Test
    public void test_wrong() {
        MultiBracketValidation instance = new MultiBracketValidation();
        assertFalse(instance.multiBracketValidation(")["));
    }

    //only have one bracket input
    @Test
    public void test_singleInput() {
        MultiBracketValidation instance = new MultiBracketValidation();
        assertFalse(instance.multiBracketValidation("["));
    }

}