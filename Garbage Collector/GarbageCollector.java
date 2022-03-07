public class GarbageCollector {
    public static void main(String[] args) {
        GarbageCollector obj = new GarbageCollector();
        obj = null;

        GarbageCollector a = new GarbageCollector();
        GarbageCollector b = new GarbageCollector();

        b = a;
        System.gc();
    }
    protected void finalize()throws Throwable
    {
        System.out.println("Gabrage Collection is performed by JVM ");
    }
}
