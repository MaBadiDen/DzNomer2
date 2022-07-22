public class Main {
    public static void main(String[] args) {
        /* Первое задание */
        int _int = 42;
        long _long = 21546654L;
        short _short = 23123;
        boolean _byte = false;
        float _float = 1.1111f;
        double _double = 11.1215;
        char _char = 'a';

        /*Второе задание*/
        float ves1 = 78.2f;
        float ves2 = 82.7f;

        System.out.println("Суммарный вес двух бойцов = " + (ves1 + ves2));
        System.out.println("Разница между весами двух бойцов = " + (ves2 - ves1));

        /*Третье задание*/
        double banan = 80;
        double banana_count = 5;
        double moloko = 105;
        double moloko_count = 2;
        double ice = 100;
        double ice_count = 2;
        double egg = 70;
        double egg_count = 4;
        double breakfast;

        breakfast = (banan * banana_count + moloko * moloko_count + ice * ice_count + egg * egg_count)/1000;

        System.out.println("Общий вес завтрака = " + breakfast + "кг");

        /*Четвертое задание*/
        double slow_diet = (double)7000/250;
        double fast_diet = (double)7000/500;
        double average_diet = (slow_diet + fast_diet) / 2;
        System.out.println("Если худеть по 250г в день, спортсмен похудеет за " + (int)slow_diet + "дней, если худеть по 500г в день, то спортсмен похудеет за " + (int)fast_diet + "дней");
        System.out.println("В среднем спортсмену нужно " + (int)average_diet + " дней на похудение");

        /*Пятое задание*/
        double Masha = 67760;
        double Denis = 83690;
        double Cristina = 76230;

        double MashaNew = Masha * 1.1;
        double DenisNew = Denis * 1.1;
        double CristinaNew = Cristina * 1.1;

        System.out.println("Маша теперь получает " + MashaNew + "р. Её зп выросла на " + (MashaNew - Masha) + "р.");
        System.out.println("Денис теперь получает " + DenisNew + "р. Его зп выросла на " + (DenisNew - Denis) + "р.");
        System.out.println("Кристина теперь получает " + CristinaNew + "р. Её зп выросла на " + (CristinaNew - Cristina) + "р.");


    }
}