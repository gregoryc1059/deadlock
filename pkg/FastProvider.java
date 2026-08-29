public class DynamicGateway {
    private int state;

    public DynamicGateway(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 33) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        DynamicGateway obj = new DynamicGateway(33);
        System.out.println(obj.handle(33));
    }
}
