import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         /*          Task 5
 1) ЭКИ КЛАСС ТУЗУНУЗ APARTMENT (TITLE, PRICE, ADDRESS), STUDENT ( FULLNAME, PHONENUMBER, ADDRESS, BANKACCOUNT)
 2) APARTMENT КЛАССЫНА 2 ОБЬЕКТ, STUDENT КЛАССЫНА 6 ОБЬЕКТ ТУЗУП, АЛАРДЫН ПОЛЕЛЕРИН ТОЛТУРУНУЗ. (БИР КВАРТИРАНЫН
 ЖАНА 3 СТУДЕНТТИН АДРЕСТЕРИ ОКШОШ БОЛСУН, ЭКИНЧИ КВАРТИРАНЫН ЖАНА КАЛГАН 3 СТУДЕНТТЕРДИН АДРЕСТЕРИ ОКШОШ БОЛСУН)
 3)СТУДЕНТЕРДИ ОЗУНЧО МАССИВГЕ, КВАРТИРАЛАРДЫ ОЗУНЧО МАССИВГЕ САЛЫНЫЗ.

 4)КОНСОЛЬДОН КВАРТИРАНЫН НАЗВАНИЯСЫН БЕРСЕНИЗ, ОШОЛ КВАРТИРАНЫ ЖАНА АНДА ЖАШАГАН СТУДЕНТТЕРДИ КОНСОЛЬГО ЧЫГАРА
 ТУРГАН МЕТОД ТУЗУНУЗ
 5)КВАРТИРА КЛАССЫНЫН ИЧИНДЕ БИР PAYPERMONTH(); ДЕГЕН МЕТОДУ БОЛСУН, АЛ МЕТОД АР БИР СТУДЕНКЕ КАНЧА СОМДОН
 КВАРТПЛАТА БЕРУУСУН ЧЫГАРСЫН.
 6)СТУДЕНТ КЛАССЫНЫН ИЧИНДЕ БИР LIVEIN(); ДЕГЕН МЕТОД БОЛСУН, АЛ МЕТОД СТУДЕНТТИН КАПЧЫГЫНА ЖАРАША АЛ КВАРТИРАДА
 КАНЧА АЙ ЖАШАЙ АЛУУСУН ЧЫГАРСЫН.
 7)СТУДЕНТ КЛАССЫНДА ДАГЫ БИР CHANGEINFO(); ДЕГЕН МЕТОД БОЛСУН АЛ МЕТОД
 СТУДЕНТТИН ДАННЫЙЛАРЫН ОЗГОРТУП БЕРСИН.     */


        Apartment[] apartments = {new Apartment("Green Tower", 12000, "Main St, 101"),
                new Apartment("Sunrise Complex", 10000, "Ocean Ave, 202")
        };

        Student[] students = {
                new Student("Алексей Иванов", "+123456789", "Main St, 101", 5000),
                new Student("Мария Петрова", "+234567891", "Main St, 101", 4000),
                new Student("Дмитрий Сидоров", "+345678912", "Main St, 101", 6000),

                new Student("Елена Смирнова", "+456789123", "Ocean Ave, 202", 4500),
                new Student("Анна Федорова", "+567891234", "Ocean Ave, 202", 7000),
                new Student("Иван Кузнецов", "+678912345", "Ocean Ave, 202", 5500),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название квартиры: ");
        String enteredTitle = scanner.nextLine();


        for (Apartment apartment : apartments) {
            if (apartment.getTitle().equals(enteredTitle)) {
                System.out.println(apartment.toString());
                System.out.println("\nСтуденты, живущие здесь:");
                for (Student student : students) {
                    if (student.getAddress().equals(apartment.getAddress())) {
                        System.out.println(student.toString());



                        double rentPerStudent = apartment.payPerMonth(3);
                        System.out.println("Квартплата для " + student.toString() + " Квартплата: " + rentPerStudent);


                        int months = student.liveIn(rentPerStudent);
                        System.out.println(student.toString() + " может прожить " + months + " месяцев.\n");
                    }
                }
                System.out.println();
            }
        }


        System.out.print("Хотите изменить данные студента? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Введите имя студента для изменения данных: ");
            String nameToChange = scanner.nextLine();

            for (Student student : students) {
                if (student.toString().contains(nameToChange)) {
                    System.out.print("Новое ФИО: ");
                    String newFullName = scanner.nextLine();
                    System.out.print("Новый номер телефона: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Новый адрес: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Новый баланс: ");
                    double newBankAccount = scanner.nextDouble();
                    scanner.nextLine();

                    student.changeInfo(newFullName, newPhoneNumber, newAddress, newBankAccount);
                    System.out.println("Данные успешно изменены!");
                    System.out.println("Новая информация: " + student.toString());
                    break;
                }
            }
        }


    }
}