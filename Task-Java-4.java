// 1. Ввод с консоли в формате Ф.И.О Возраст пол

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        String lastName, position, Retirement;
        int age, dailyWage, AnnualSalary;
 
// Запрос данных у пользователя
String firstName = inputStr("Please provide your First Name: ");
        lastName = inputStr("Please provide your Last Name: ");
        age = inputInt("Please provide your age: ");
        dailyWage = inputInt("Please input your dayly wage: ");
        position = inputStr("Please provide position: ");
        
// Вывод информации
        System.out.println("\nFull name: " + firstName + " " + lastName
                    + ".\nAge: " + age
                    + " y.o.\n" + Retirement
                    + " \nAnnualSalary: " + AnnualSalary
                    + " tugrecs\nPosition: " + position + ".");
                    
                    
 // 2. Выход из режима вода по горячей кнопке                   
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Введите число");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите операцию");
        String s = sc.nextLine();
        System.out.println("Введите число");
        int b = sc.nextInt();
        if (s.equals("+")) {
            int res = 0;
            res = a + b;
            System.out.println(res);
        }
        char c = s.charAt(0);
        if (c == ('q'))
            System.exit(0);
       
    } while(true);

private void button1_Click(object sender, EventArgs e)
{
    Close();
}

// 3. Вывод несортированного списка в формате Иванов И.И. 32M
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// import java.util.Comparator;
import java.util.LinkedList;

public class Program
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();


        String text = " ";
        FileReader reader = new FileReader("db.sql");
        while (reader. ready ()) {
            text += (char) reader. read();
        }
        reader.close();
        String [] str = text.split("\r\n");
        for (int i = 1; i < str.length; i++){
            String [] sb = str[i].split(" ");

            family.add(sb[0] + " ");
            name.add(sb[1].substring(0, 1) + ".");
            soname.add(sb[2].substring(0, 1) + "." + " ");
            age.add(Integer.valueOf(sb[3]));
            gender.add(sb[4] == "M" ? true : false);
            index.add(i);
        }
        
        // new *
        //index. sort(new Comparator<Integer>() {
        //   new *
        //   @Override
        //   public int compare(Integer o1, Integer o2)  {
        //       return o2-o1;
        //   }        
        //});

        for (int i = 0; i < index.size(); i++){
            System.out.printf(family.get(i));
            System.out.printf(name.get(i));
            System.out.printf(soname.get(i));
            System.out.printf(age.get(i).toString());
            System.out.printf((gender.get(i) ? "M" : "Ж"));
            System.out.println();
        }

            // System.out.println(family); 

            // System.out.println(sb[0] + " " + sb[1].charAt(0) + "." + sb[2].charAt(0) + "." + " " + sb[3] + " " + sb[4]);
        
    }
    
}

