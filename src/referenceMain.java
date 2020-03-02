//import java.security.Identity;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.*;

public class referenceMain {
    public static void main1(String[] args) {
    Integer test = 1;
    Integer test1 = 2;
    Integer test2 = 3;
        SoftReference<Integer> softReference = new SoftReference<>(test);
        test = null;
        System.gc();

        System.out.println(softReference+" "+ test);
        WeakReference<Integer> weakReference = new WeakReference<>(test1);
        test1 = null;

        PhantomReference<Integer> phantomReference = new PhantomReference<>(test2, new ReferenceQueue<>());
        test2 = null;
    }
    public static void main(String[] args) {
        HashMap<Integer,String> hM = new HashMap<>();
        hM.put(32,"Egorka");
        hM.put(312,"Marina");
        hM.put(13,"Roma");
        System.out.println(hM);


        String str = "1 java 23423413 java 234 java 3";
        Scanner sc = new Scanner(str).useDelimiter("\\s*java\\s*");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }

    }
}

