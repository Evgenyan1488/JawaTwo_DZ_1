public class Human implements Move {

    public int stamina;

    public Human(int stamina)
    {
        this.stamina = stamina;
    }

    public void jump(Wall wall)
    {
        if(this.stamina < wall.height)
        {
            System.out.println("Чел не прыгнул");
            this.stamina = 0;
        }
        else
        {
            this.stamina -= wall.height;
            System.out.println("Чел прыгнул");
        }

    }
    public void run(Road road)
    {
        if(this.stamina < road.lenght)
        {
            System.out.println("А всё, не побежал");
        }
        else
        {
            this.stamina -= road.lenght;
            System.out.println("Чел побежал");
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
