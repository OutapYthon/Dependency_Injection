package dao;

public class DaoImpl implements IDao {
    public DaoImpl() {
    }

    public double getData() {
        System.out.println("Version de base des données");
        double temp = (double)23.0F;
        return temp;
    }
}
