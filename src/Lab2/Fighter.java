public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack = 0;

    public Fighter(String name, int health,int damagePerAttack )
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public void attack(String opponent)
    {
        System.out.println(name + " did " + damagePerAttack +" hp to " +opponent);
    }
}


