package soldiers;

import java.util.ArrayList;
import java.util.List;
public class Army {
    String name;

    List<Unit> units;

    public Army() {
        this.units = new ArrayList<>();
    }

    public Army(List<Unit> units) {
        this.units = units;
    }

    public void addUnits(List<Unit> units) {
        for (int i = 0; i < units.size(); i++) {
            this.units.add(units.get(i));
        }
    }

    public void showArmy() {
        System.out.println(this.units);
    }
}
