import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = romanMap.get(s.charAt(i));
            if (i + 1 < s.length() && value < romanMap.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();
        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);
        scanner.close();
    }
}