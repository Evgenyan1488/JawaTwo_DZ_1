public class Cat implements Move {

    public int food;

    public Cat(int food)
    {
        this.food = food;
    }

    private void jump(Wall wall) {
        if (this.food < wall.height)
        {
            System.out.println("Кот не прыгнул");
            this.food = 0;
        }
        else
        {
            this.food -= wall.height;
            System.out.println("Кот прыгнул");
        }
    }

    private void run(Road road)
    {
        if(this.food < road.lenght)
        {
            System.out.println("А кот то больше не рабочий походу");
        }
        else
        {
            this.food -= road.lenght;
            System.out.println("Котяра погнал");

        }

    }


    @Override
    public void move(Obst obst) {
        if (obst instanceof Road)
        {
            Road road = (Road) obst;
            run(road);
        } else if (obst instanceof Wall)
        {
            Wall wall = (Wall) obst;
            jump(wall);
        }

    }
}
