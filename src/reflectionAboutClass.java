
import java.lang.reflect.Member;

public class reflectionAboutClass {

    public static void main (String args[]) {
        try {
            Class<?> cl = Class.forName(args[0]);
            System.out.println(cl);
            printMembers(cl.getFields());
            printMembers(cl.getConstructors());
            printMembers(cl.getMethods());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("nothing know about class");
        }
    }
        private static void printMembers (Member [] mems) {
            for (int i=0;i<mems.length;i++) {
                if (mems[i].getDeclaringClass()==Object.class)
                    continue;
                String decl = mems[i].toString();
                System.out.println("\t"+decl);

            }
        }

}
