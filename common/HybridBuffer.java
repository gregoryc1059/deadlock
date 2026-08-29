public class StreamAdapter {
    private int state;

    public StreamAdapter(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 9) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        StreamAdapter obj = new StreamAdapter(9);
        System.out.println(obj.encode(9));
    }
}
