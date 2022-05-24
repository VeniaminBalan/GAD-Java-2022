package PROJECT.AbstractFactory;

public class EnchantedRoom extends Room {
    Spell spell;

    public EnchantedRoom(int roomNo, Spell spell){
        super(roomNo);
        this.spell = spell;
    }

    @Override
    public void Enter() {
        System.out.println("Enchanted Room");
    }
}
