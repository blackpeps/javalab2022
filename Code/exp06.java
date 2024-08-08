public class garbageCollector {
    public void finalize() {
        System.out.println("Object Memory is released");
    }
    public static void main(String[] args) {
        garbageCollector g = new garbageCollector();
        g = null;
        System.gc();
    }
}
