class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int j = 0;

        for (int asteroid : asteroids) {

            while (j > 0 && stack[j - 1] > 0 && asteroid < 0 &&
                   stack[j - 1] < -asteroid) {
                j--;
            }

            if (j > 0 && stack[j - 1] > 0 && asteroid < 0) {

                if (stack[j - 1] == -asteroid) {
                    j--;
                }

                // else top is bigger, current asteroid dies

            } else {
                stack[j++] = asteroid;
            }
        }

        return java.util.Arrays.copyOf(stack, j);
    }
}