package Zombie;

public class Zombie {
    int age;
    String name;
    int health;
    boolean dead = false;

    public Zombie(int age, String name){
        this.age = age;
        this.name = name;
        health = 100;
    }

    public void gotAttacked(){
        if (checkDead() != true){
            health -= 20;
            System.out.println("Ouch");
            System.out.println(health);

        }

    }
    public boolean checkDead(){
        if (health <= 0) {
            dead = true;
            System.out.println("I'm Dead");
        }
        return dead;
    }

    public String toString(){
        System.out.println("Age: " + age + " Name: " + name + " Health: " + health);
        return "Age: " + age + " Name: " + name + " Health: " + health;
    }
}


class ZombieKiller { // This is the main class
    public static void main(String[] args) { //  Again, this is the entry point of the program. No Main class just the main method.
        Zombie zombie = new Zombie(5, "Jeff");

        while (zombie.dead != true){
            zombie.gotAttacked();
        }
    }
}