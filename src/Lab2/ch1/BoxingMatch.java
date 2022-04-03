package Lab2.ch1;

import Lab2.ch1.Fighter;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter F1, Fighter F2)
    {
        fighter1 = F1;
        fighter2 = F2;
    }

    public String fight()
    {
        do {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }while (fighter1.getHealth() > 0 || fighter2.getHealth() > 0);

        if(fighter1.getHealth() == fighter2.getHealth()) return "draw";
        else if(fighter1.getHealth() > fighter2.getHealth()) return fighter1.getName();
        else return  fighter2.getName();
    }
}
