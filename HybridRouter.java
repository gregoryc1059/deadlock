public class SimpleMonitor {
    private int state;

    public SimpleMonitor(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 33) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        SimpleMonitor obj = new SimpleMonitor(33);
        System.out.println(obj.collect(33));
    }
}
