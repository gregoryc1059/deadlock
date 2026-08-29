public class StreamGateway {
    private int state;

    public StreamGateway(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 3) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        StreamGateway obj = new StreamGateway(3);
        System.out.println(obj.compute(3));
    }
}
