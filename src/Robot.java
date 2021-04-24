public class Robot implements Move {
    public int energy;

    public Robot(int energy)
    {
        this.energy = energy;
    }

    public void jump(Wall wall) {
        if (this.energy < wall.height)
        {
            System.out.println("Робат не прыгнул");
        }
        else
        {
            this.energy -= wall.height;
            System.out.println("Робат прыгнул");
        }
    }


    public void run(Road road)
    {
        if(this.energy < road.lenght)
        {
            this.energy = 0;
            System.out.println("Робот разрядился, ясно ксяоми");
        }
        else
        {
            this.energy -= road.lenght;
            System.out.println("Робат побежал");

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
