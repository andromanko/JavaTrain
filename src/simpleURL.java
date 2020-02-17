import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class simpleURL {
    public static void main(String[] args) throws MalformedURLException {
        URL urlAPI= new URL("https://currency.com/ru");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(urlAPI.openStream()))) {
            String str;
            //System.out.println(br);
            while ((str=br.readLine())!=null) {
                System.out.println(str);
            }

        }
        catch (IOException e) {e.printStackTrace();}



    }
}
