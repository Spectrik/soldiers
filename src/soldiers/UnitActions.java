package soldiers;

public interface UnitActions<T> {
    public void attack(T o);

    public int block(T o);

}
