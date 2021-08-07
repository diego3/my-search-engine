package engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void firstIsAfterSecond() {
        String a = "a";
        String b = "b";
        assertTrue(a.compareToIgnoreCase(b) < 0);// a < b
        assertFalse(a.compareToIgnoreCase(b) > 0);// a > b
        assertEquals(a.compareToIgnoreCase("a"), 0);// a == a

        assertFalse(StringUtils.firstIsAfterSecond("a", "b"));
        assertFalse(StringUtils.firstIsAfterSecond("a", "f"));
        assertTrue(StringUtils.firstIsAfterSecond("f", "d"));
        assertTrue(StringUtils.firstIsAfterSecond("f", "a"));
        assertFalse(StringUtils.firstIsAfterSecond("f", "z"));
    }
}