package BY.BELHARD.BH24.HW.HW08_09;

/*создать файл с числами, разделенными пробелами. Записать в другой файл кубы этих чисел.*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HW8TASK1 {

    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();
    BufferedReader reader = null;
    String input;
    List<String> listofIntStrings = new ArrayList<>();

    try {
            reader = new BufferedReader(new FileReader("testfile"));
            while (reader.ready()){
                input = reader.readLine();
                listofIntStrings.add(input);
                // System.out.println(listofIntStrings);

            }
        reader.close();
    }
        catch (IOException e){
            System.out.println("Файл не найден");
        }


    String [] subStr;
    String delimiter = " ";
    // List <Integer> output = new ArrayList<>();

        for (String s: listofIntStrings) {
            subStr = s.split(delimiter);

            int z;
            int tripleZ;

            for(int i = 0; i < subStr.length; i++){
                z = Integer.parseInt(subStr[i]);
                // output.add(z*z*z);
                tripleZ = z*z*z;
                sb.append(tripleZ).append(" ");
                            }
            sb.append("\n");
        }

        System.out.println(sb);

        try {

            File file = new File("testOutStream");
            BufferedWriter Writer = new BufferedWriter(new FileWriter(file));

            //Writer.write(String.valueOf(output));
            Writer.write(String.valueOf(sb));
            Writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}}
