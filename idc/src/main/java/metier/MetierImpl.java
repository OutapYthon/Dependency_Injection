package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }

    public double calculate() {
        double t = this.dao.getData();
        double res = t * (double)23.0F;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
