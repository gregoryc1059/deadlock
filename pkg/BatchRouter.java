public class HybridClient {
    private int state;

    public HybridClient(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 3) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        HybridClient obj = new HybridClient(3);
        System.out.println(obj.sync(3));
    }
}
