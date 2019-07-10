package repeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void test_emptyString() {
        RepeatedWord test = new RepeatedWord();
        assertNull(test.duplicateWords(""));
    }

    @Test
    public void test_nullString() {
        RepeatedWord test = new RepeatedWord();
        assertNull(test.duplicateWords(null));
    }

    @Test
    public void test_duplicationString() {
        RepeatedWord test = new RepeatedWord();
        String result = test.duplicateWords("Once upon a time, there was a brave princess who...");
        assertEquals("a", result);
    }

    @Test
    public void test_noduplicationString() {
        RepeatedWord test = new RepeatedWord();
        String result = test.duplicateWords("Once upon time, there was a brave princess who...");
        assertNull( result);
    }

}