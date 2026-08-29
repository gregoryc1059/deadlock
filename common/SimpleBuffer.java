public class SecureClient {
    private int state;

    public SecureClient(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 75) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SecureClient obj = new SecureClient(75);
        System.out.println(obj.resolve(75));
    }
}
