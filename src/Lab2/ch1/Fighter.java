package Lab2.ch1;

public class Fighter {
    String name;
    int health;
    int damagePerAttack = 0;

    public Fighter(String name, int health,int damagePerAttack )
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public void attack(Fighter opponent)
    {
        opponent.health -= damagePerAttack;
    }
}


