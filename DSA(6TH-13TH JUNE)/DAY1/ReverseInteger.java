package DAY1;

class ReverseInteger {
    public int reverse(int x) {
        int revDigit = 0;

        while (x != 0) {
            int digit = x % 10;

            if (revDigit > Integer.MAX_VALUE / 10 ||
               (revDigit == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            if (revDigit < Integer.MIN_VALUE / 10 ||
               (revDigit == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            revDigit = revDigit * 10 + digit;
            x /= 10;
        }

        return revDigit;
    }
}