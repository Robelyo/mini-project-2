public class idgenerator {
    private static int nextid=1;
    public static synchronized int idgen(){
        return nextid++;
    }
}
