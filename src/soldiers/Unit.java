package soldiers;

import java.util.Random;
public class Unit implements UnitActions<Unit>{

    String name;
    int hp = 100;

    int energy = 100;
    int baseattack = 10;

    int basedefense = 5;

    public int getBasedefense() {
        return basedefense;
    }

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean is_critical() {
        return  true;
    }

    @Override
    public void attack(Unit target) {
        Random random = new Random();
        int attack_value = this.baseattack + (random.nextInt(5 + 5) - 5);
        int defense_value = target.block(this);

        int dmg = attack_value - defense_value;
        target.setHp(target.getHp() - dmg);
        System.out.println(this.name + " is attacking with " + attack_value + " attack");
        System.out.println(target.getName() + " receives " + dmg + " damage");
    }

    @Override
    public int block(Unit attacker) {
        Random random = new Random();
        int value = this.basedefense + (random.nextInt(2 + 2) - 2);
        System.out.println(this.name + " is blocking with " + value + " attack");

        return value;
    }
}
