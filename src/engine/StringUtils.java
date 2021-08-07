package engine;

public class StringUtils {
    /**
     * Compare lexicographically if the first string is after the second string
     *
     * @param first first string
     * @param second second string
     * @return True if the first string is after than the second string alphabetically
     */
    public static boolean firstIsAfterSecond(String first, String second) {
        return first.compareToIgnoreCase(second) > 0;
    }
}
