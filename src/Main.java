public class Main {
    public static void main(String[] args) {
        int summ = 0;
        int arrayCash[] = {
                102_000,106_000,175_000,125_000,101_000,182_000,149_000,154_000,131_000,113_000,
                126_052,132_457,123_098,102_987,192_981,171_799,195_042,177_900,101_002,166_066,
                126_052,132_457,123_098,102_987,192_981,182_000,149_000,154_000,131_000,113_000,
        };
        for(int i = 0; i < arrayCash.length;i++){
            summ=summ+arrayCash[i];
        }
        float medium;
        System.out.println("Сумма трат за месяц составила "+summ+" рублей.");
        int min = 200_000;
        for (int i = 0;i < arrayCash.length;i++)
        {
            if(arrayCash[i]< min)
            {
                min = arrayCash[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей.");
        int max = -1;
        for(int i = 0;i < arrayCash.length;i++)
        {
            if(arrayCash[i]> max)
            {
                max = arrayCash[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+max+" рублей.");
        medium = summ/30;
        System.out.println("Средняя сумма трат за месяц составила " +medium+" рублей");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i >= 0;i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
