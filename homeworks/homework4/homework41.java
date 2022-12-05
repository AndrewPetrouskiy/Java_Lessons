package homeworks.homework4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках. 
// Сортировать пользователей по возрасту. 
// Не вывести в порядке возрастания возрастов а именно сортировать!)
public class homework41 {
    public static void main(String[] args) {
        sortAllLists();
    }
        
    public static void sortAllLists() {
        ArrayList<String> lName = new ArrayList<>();
        ArrayList<String> lsurname = new ArrayList<>();
        ArrayList<String> lpName = new ArrayList<>();
        ArrayList<Integer> lage = new ArrayList<>();
        ArrayList<String> lsex = new ArrayList<>();
        LinkedList<Integer> counter = new LinkedList<>();

        boolean add = true;
        while (add) {
            System.out.println("Do u want to add the person? Y/N");
            Scanner scan = new Scanner(System.in);
            String decision = scan.nextLine();
            if (decision.toUpperCase().equals("N")) {
                add = false;
            } else {
                Scanner scanner = new Scanner(System.in);
                Scanner scanAge = new Scanner(System.in);
                Scanner scanSex = new Scanner(System.in);

                System.out.println("Please enter your surname, name and patronymic : ");
                String nsp = scanner.nextLine();
                System.out.println("Eneter your age: ");
                Integer age = scanAge.nextInt();
                lage.add(age);
                String[] nspSplit = nsp.split(" ");
                if (nspSplit.length == 3) {
                    lsurname.add(nspSplit[0]);
                    lName.add(nspSplit[1]);
                    lpName.add(nspSplit[2]);
                } else if (nspSplit.length == 2) {
                    lsurname.add(nspSplit[0]);
                    lName.add(nspSplit[1]);
                    lpName.add("");
                } else {
                    lsurname.add(nspSplit[0]);
                    lName.add("");
                    lpName.add("");
                }
                System.out.println("Please enter your gender: M or F ");
                String gender = scanSex.nextLine();
                if (gender.toUpperCase().contains("F")) {
                    lsex.add("true");
                }
                else  {
                    lsex.add("false");
                }
                counter.add(lage.size() - 1); 

                int cnt = lage.size()-1;
                while (cnt > -1) {
                    int max_age = lage.get(counter.get(cnt));
                    int index = cnt;
                    for (int i = 0; i < cnt; i++){
                        if (max_age < lage.get(counter.get(i))){
                            max_age = lage.get(counter.get(i));
                            index = i;
                        }
                    }
                    int tmp = counter.get(cnt);
                    counter.set(cnt, counter.get(index));
                    counter.set(index, tmp);
        
                    cnt--;
                }
                counter.forEach(i ->
                System.out.println(lsurname.get(i)+ " "+lName.get(i)+ " " +lpName.get(i) + " " +lage.get(i) + " " +lsex.get(i)));
                

            }
        }
    } 
 
    
}
