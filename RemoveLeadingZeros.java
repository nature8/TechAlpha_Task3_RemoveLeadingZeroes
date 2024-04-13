public class RemoveLeadingZeros {
    public static void main(String...ar) {
        String input = "00000123789";
        System.out.println("Original string: " + input);

        // Find the index of the first non-zero character
        int index = 0;
        while (index < input.length() && input.charAt(index) == '0') {
            index++;
        }

        // Extract the substring starting from the first non-zero character
        String outputpublic class PatternPrinting {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Printing the upper half of the pattern
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch = (char) (ch - 2);
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }

        // Printing the lower half of the pattern
        for (int i = n - 2; i >= 0; i--) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch = (char) (ch - 2);
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
 = input.substring(index);

        System.out.println("String after removing leading zeros: " + output);
    }
}
