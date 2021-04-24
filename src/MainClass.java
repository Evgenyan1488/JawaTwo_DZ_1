import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int h, l;

        System.out.println("Введите количество препятствий");
        int n = in.nextInt();


        Obst arrP[] = new Obst[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Выберите препятствие; 1 - стена, 2 - дорога");
            int vibor = in.nextInt();
            if (vibor == 1) {
                System.out.println("Введите высоту стены");
                h = in.nextInt();
                arrP[i] = new Wall(h);
            } else {
                System.out.println("Введите длину дороги");
                l = in.nextInt();
                arrP[i] = new Road(l);
            }
        }

        System.out.println("Введите количество участников");
        int m = in.nextInt();

        Sushnost[] arrS = new Sushnost[m];

        for (int i = 0; i < m; i++)
        {

            System.out.println("Выбери гендер: 1 - чел, 2 - робат 3 - кот");

            int vibor = in.nextInt();
            arrS[i] = new Sushnost(vibor);
            if (vibor == 1)
            {
                arrS[i].state[i] = 1;
                System.out.println("Введи выносливость чела");
                int stam = in.nextInt();
                arrS[i].human = new Human(stam);
                //arrS[i].human.stamina = in.nextInt();


            } else if (vibor == 2)
            {
                arrS[i].state[i] = 2;
                System.out.println("Введи энергию робота");
                arrS[i].robot.energy = in.nextInt();
            } else if (vibor == 3)
            {
                arrS[i].state[i] = 3;
                System.out.println("Введи сытость кота");
                arrS[i].cat.food = in.nextInt();
            }
        }



        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                if (arrS[i].state[i] == 1)
                    arrS[i].human.move(arrP[j]);
                else if (arrS[i].state[i] == 2)
                    arrS[i].robot.move(arrP[j]);
                else if (arrS[i].state[i] == 3)
                    arrS[i].cat.move(arrP[j]);
        }

    }
};
