
package BY.BELHARD.BH24.HW.HW08_09;
/*
    В файле balance.dt хранятся данные о балансе счетов людей. Имена не повторяются.
    В файле transactions.dt хранятся данные о транзакциях - кто и кому пытался передать деньги.
     Обратите внимание, транзакция может быть невалидной, если невозможно определить отправителя или получателя средств,
      а также если на счету отправителя не хватает средств для перевода.
       В таком случае транзакция отклоняется (не выполняется).
       Записать в выходной файл количество средств на счетах людей после выполнения валидных транзакций,
       отсортированные по именам (по алфавиту). Файлы в архиве в аттаче.*/


import java.io.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HW8TASK4 {

    public static void main(String[] args) throws Exception{
        //Integer currentAmount;

        BufferedReader reader = new BufferedReader(new FileReader("balance.dt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("transactions.dt"));
        Map<String, Integer> bankAccounts = new HashMap<>();



        while (reader.ready()) {

            String[] subString = reader.readLine().split(" ");
            String client = subString[0];
            Integer money = Integer.parseInt(subString[1]);
            bankAccounts.put(client, money);
        }
            System.out.println(bankAccounts);
            System.out.println("_______________________________________________________");


        while (reader2.ready()){
            String transaction = reader2.readLine();
            System.out.println(transaction);
            System.out.println("______________________________________________");
            String [] subString2 = transaction.split(" ");
            String clientOut = subString2[0]; //Разделили транзакцию - плательщик
            String clientIn = subString2[1]; //Разделили транзакцию - получатель
            int transferredAmount = Integer.parseInt(subString2[2]); // Сумма перевода
            System.out.println("Плательщик " + clientOut + "   Получатель   " + clientIn + "   Сумма перевода  " + transferredAmount);


            if(bankAccounts.containsKey(clientOut)){
                int currentAmount = bankAccounts.get(clientOut); // вытягиваем текущий остаток плательщика
                System.out.println("Текущий остаток плательщика " + currentAmount);
                System.out.println("______________________________________________");
                if (currentAmount < transferredAmount){
                    System.out.println("Невалидная транзация. Не хватает средств на счету");}
                    else
                        currentAmount = currentAmount-transferredAmount;
                        System.out.println("остататок средств на счету после операции  " + currentAmount);
                        bankAccounts.put(clientOut,currentAmount);
                        System.out.println(bankAccounts);
                        try {
                            bankAccounts.put(clientIn, bankAccounts.get(clientIn)+transferredAmount);

                        }
                        catch (Exception e){
                            System.out.println("Error");
                        }




                }
            }
            System.out.println();
            System.out.println("******************************************");


            System.out.println("Итоговые счета" + bankAccounts);
reader.close();
reader2.close();
        try {

            File file = new File("transactionfinale.dt");
            BufferedWriter Writer = new BufferedWriter(new FileWriter(file));


            Writer.write(String.valueOf(bankAccounts));
            Writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    }


