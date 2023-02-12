public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1500;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;}
            else {
                bonus = 0;

            }
            int total = balance + deposit + bonus;

            System.out.println("Итоговая сумма на счете: " + total + " рублей" + " в том числе бонус за пополнение " + bonus + " рублей");
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
