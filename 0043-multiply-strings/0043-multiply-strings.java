class Solution {
    public String multiply(String num1, String num2) {
        // If either number is zero, return "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        
        // This array will hold the result of multiplication
        int[] result = new int[m + n];

        // Multiply each digit of num1 with each digit of num2
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // Multiply digits and add to the result array
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];  // Add previous value at this position
                result[i + j + 1] = sum % 10;  // Store the unit place
                result[i + j] += sum / 10;  // Carry over to the next position
            }
        }

        // Build the final string from the result array
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);  // Append digits to the string builder
            }
        }

        return sb.toString();
    }
}
