package soldiers;

public class Infantry extends Unit {

    String unittype = "infantry";

    public Infantry(String name) {
        super(name);
    }

    @Override
    public int block(Unit attacker) {
       int value = super.block(attacker);

       if (attacker instanceof Cavalry) {
           value /= 2;
           System.out.println("Biggo attacko!");
       }

       return value;
    }
}
