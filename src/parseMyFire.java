import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.MatchResult;
import java.util.regex.*;
import javax.swing.*;

public class parseMyFire {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        //test1.



        test1.main();
        //test1.;


        //read file to array
        String csvFile = "//home/roma/csv/Dry1Fire_0001.CSV";
        String line = "";
        String csvSplitBy = ",";
        String time;
        Integer var1, var2;
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date date=null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] strings = line.split(csvSplitBy);
                //System.out.println(strings[1]);
                time = strings[0];
                //если нашли год - то значит уже идут "наши" строки
                if (time.contains("2018")) {
                    //date1=strings[0].parse(sDate1)
                    //try ( Date date2 = new Date()) {date2 =dFormat.parse("2018/11/11");}
                    //catch (ParseException e) {};
                    var1 = (Integer)Math.round(Float.parseFloat(strings[1])*100);
                    var2 = (Integer)Math.round(Float.parseFloat(strings[2])*100);
                    System.out.println("ы" + var1 + "ы" + var2);
                    a1.add(var1);
                    a2.add(var2);
                    //test1.textArea1.setText("123");
                    //ЗДЕСЬ ПРОСТО ПРОВЕРКА НА 2018 - ТИПА ГОД. СДЕЛАЮ ЛУЧШЕ ЧЕРЕЗ РЕГУЛЯРНОЕ ВЫРАЖЕНИЕ
                    //проверка time на регулярное выражение - yyyy/mm/dd //hh/m
                    //test1.textfield1.setText(var1+" "+var2);
                }
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }

       // Pattern p = Pattern.compile("\\+[1-9]\\d{2}\\(\\d{2}\\)\\d{3}(-\\d{2}){2}");
        //Matcher m = p.matcher(("+375(29)551-08-78"));
        //boolean b = m.matches();
        //System.out.println(b);




    }
}
