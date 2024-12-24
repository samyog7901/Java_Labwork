public class CountVowels {
    public static void main(String[] args) {
        String str = "Programming";
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
