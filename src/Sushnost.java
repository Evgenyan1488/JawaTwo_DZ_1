

public  class Sushnost {

    public Human human;
    public Cat cat;
    public Robot robot;
    public static int[] state = new int[10];


    public Sushnost(int type)
    {
        if (type == 1)
        {
            human = new Human(10);
        }
        else if (type == 2)
        {
            robot = new Robot(10);
        }
        else if (type == 3)
        {
            cat = new Cat(10);
        }
    }
}
