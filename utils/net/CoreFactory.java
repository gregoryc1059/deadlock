public class BatchBuilder {
    private int state;

    public BatchBuilder(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 86) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        BatchBuilder obj = new BatchBuilder(86);
        System.out.println(obj.run(86));
    }
}
