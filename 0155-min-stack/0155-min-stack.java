class MinStack {
    private int[] arr;
    private int[] minArr;
    private int top = -1;
    private int size = 5;

    public MinStack() {
        arr = new int[size];
        minArr = new int[size];
    }

    public void push(int value) {
        top++;
        if (top >= size) {
            size *= 2;
            arr = Arrays.copyOf(arr, size);
            minArr = Arrays.copyOf(minArr, size);
        }
        arr[top] = value;
        minArr[top] = (top == 0) ? value : Math.min(value, minArr[top - 1]);
    }

    public void pop() {
        top--;
    }

    public int top() {
        return arr[top];
    }

    public int getMin() {
        return minArr[top];
    }
}