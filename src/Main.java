import soldiers.Army;
import soldiers.Cavalry;
import soldiers.Infantry;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cavalry soldier1 = new Cavalry("Konicek1");
        Infantry soldier2 = new Infantry("Soldier2");
        Army army = new Army();
        soldier1.attack(soldier2);
        System.out.println(soldier2.getName() + " now has " + soldier2.getHp() + " of life");
        army.showArmy();
    }
}