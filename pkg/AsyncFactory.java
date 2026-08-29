public class HybridParser {
    private int state;

    public HybridParser(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 26) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        HybridParser obj = new HybridParser(26);
        System.out.println(obj.collect(26));
    }
}
