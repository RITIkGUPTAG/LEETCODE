class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
           int x = 0;
if (i >= 0) {
    x = a.charAt(i) - '0';
}

int y = 0;
if (j >= 0) {
    y = b.charAt(j) - '0';
}

            int sum = x + y + carry;
            res.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return res.reverse().toString();
    }
}
