package BY.BELHARD.BH24.HW.HW08_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW8TASK3NOTEASY {

    public static void main(String[] args) throws Exception{


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s;
    String divider = "";


        /*List<String> deviders = new ArrayList<>();
        deviders.add("+");
        deviders.add("-");
        deviders.add("*");
        deviders.add("/");*/

        while(true){

            s = reader.readLine();
            if(s.equals("exit"))
                break;
            else {
                s=s.replaceAll("\\s+","");
                System.out.println(s);
                if (s.contains("+")){
                    divider = "\\+";}
                    else if (s.contains("-")){
                    divider = "-";}
                    else if (s.contains("*")){
                        divider = "\\*";}
                    else if (s.contains("/")){
                    divider = "/";}


                 }


                String [] subStrings = s.split(divider);
                double q1 = Double.parseDouble(subStrings [0]);
                double q2 = Double.parseDouble(subStrings [1]);
                //System.out.println(q1);
                //System.out.println(q2);

                double rusult = 0.0;

                if (divider.equals("\\+")){
                    rusult = q1+q2;
                    System.out.println("Сумма равна " + rusult);}
                    else if (divider.equals("-")){
                    rusult = q1-q2;
                    System.out.println("Разность равна " + rusult);}
                    else if (divider.equals("\\*")){
                    rusult = q1*q2;
                    System.out.println("Произведение равно " + rusult);}
                     else if (divider.equals("/")){
                    rusult = q1/q2;
                    System.out.println("Частное равно " + rusult);}



            }



        }

        //catch(IOException e){ System.out.println("Не удалось считать строку");
        }












