public class MayTinhCasio implements MayTinhBoTuiInterFace {

    @Override
    public double cong(double x, double y) {
        return x + y;
    }

    @Override
    public double tru(double x, double y) {
        return x - y;
    }

    @Override
    public double nhan(double x, double y) {
        return x * y;
    }

    @Override
    public double chia(double x, double y) {
        return x / y;
    }

}
