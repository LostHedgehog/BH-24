package BY.BELHARD.BH24.HW.HW08_09;

/*
считать с консоли простое арифметическое выражение, например, 3 +11, 21-36, 18/ 5 или 3 * 123, вывести на консоль
результат этого выражения. Обратите внимание, что в строке могут быть пробелы(а могут и не быть).
Добавьте обработку неправильного ввода. Добавьте циклический ввод.*/


import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW8TASK3{




    public static void main(String[] args)  throws ScriptException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(true){

            try{
            s = reader.readLine();
                if(s.equals("exit"))
                    break;
                else{
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");
                    String foo = s;
                    System.out.println(engine.eval(foo));}}

            catch(IOException e){ System.out.println("Не удалось считать строку");
            }


        }

    }}
