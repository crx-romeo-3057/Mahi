public class HaystackNeedle {
    public static int findNeedle(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] haystack = {5, 3, 8, 4, 2, 9, 7};
        int needle = 4;
        int index = findNeedle(haystack, needle);
        if (index != -1) {
            System.out.println("Needle " + needle + " found at index: " + index);
        } else {
            System.out.println("Needle " + needle + " not found in the haystack.");
        }
    }
}