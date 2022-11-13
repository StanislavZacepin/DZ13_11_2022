public class Main {
    public static void main(String[] args) {
        int check = 5;
        int[] mass = new int[]{};
        check = dz1(mass);
        System.out.println(check);

        int[] masiv1 = new int[]{10, 15, 30, 70, 5};
        int[] masiv2 = new int[]{5, 10, 15, 35, 2};
        int[] masiv3 = dz3(masiv1, masiv2);
        print(masiv3);

    }

    static int dz1(int[] intMassiv) {

        for (int i = 0; i < intMassiv.length; i++) {// деления на 0
            intMassiv[i] /= 0;
        }

        for (int i = 10; i < intMassiv.length; i++) {// индекс больше размера масива

        }

        for (int i = 0; i < intMassiv.length; i++) {// ппустой масив

        }
        return 0;
        /*if (intMassiv.length == 0) return -1; // пустой масив
        if (intMassiv.length >= 10) return -2;// слишком большой
        if (intMassiv.length <= 3) return -3; // слишком маленький
        return 0;*/
    }
    //Dz2
// исключения ошибка индекса при переборе масива,
// неверный формат при попытки первести сифвол в число,
// пустой двухмерный масив масив,
// в двухмерном масиве буду встречаться тексты на не символы

    static int[] dz3(int[] masiv1, int[] masiv2) {
        if (masiv1.length != masiv2.length) throw new RuntimeException("Масивы не равны");

        int[] masiv3 = new int[masiv1.length];
        for (int i = 0; i < masiv1.length; i++) {
            masiv3[i] = masiv1[i] - masiv2[i];

        }
        return masiv3;
    }

    static void print(int[] arry) {
        for (int item : arry) {
            System.out.println(item);
        }

    }
}
