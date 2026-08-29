public class SharedGateway {
    private int state;

    public SharedGateway(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 52) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SharedGateway obj = new SharedGateway(52);
        System.out.println(obj.sync(52));
    }
}
