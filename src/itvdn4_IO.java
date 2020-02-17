import java.io.*;

public class itvdn4_IO {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("//home/roma/dataOut.txt")))) {
        out.writeShort(-1000);
        out.writeInt(-1000);
        out.writeLong(-1000L);
        out.writeUTF("HELLo, world!!! ыыыыыыыыыыЫЫЫЫЫ___\n  ");
        out.writeDouble(Math.PI);

    } catch (FileNotFoundException e)    {
            System.err.println("FNF");
        e.printStackTrace();
    }
     catch (IOException e){
         System.err.println("IOex");

            e.printStackTrace();
        }
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("//home/roma/dataOut.txt")))){

        } catch (FileNotFoundException e)    {
            System.err.println("iFNF");
            e.printStackTrace();
        }
        catch (IOException e){
            System.err.println("iIOex");
            e.printStackTrace();
        }
        //teArrayInputStream byteArrayInputStream = new ByteArrayInputStream(in);
        int tmp=0;
        //while ((tmp = inreadInt()) !=-1)    {        }
        //for (int i: in.read()) {             System.out.println(i);         }
    }
}
