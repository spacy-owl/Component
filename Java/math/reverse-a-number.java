    static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result = (result << 3) + (result << 1) + digit;
            number /= 10;
        }
        return result;
    }
