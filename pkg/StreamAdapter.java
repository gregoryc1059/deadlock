public class SmartResolver {
    private int state;

    public SmartResolver(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 85) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SmartResolver obj = new SmartResolver(85);
        System.out.println(obj.resolve(85));
    }
}
