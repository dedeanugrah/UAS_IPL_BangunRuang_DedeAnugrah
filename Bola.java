public class Bola extends BangunRuang {
    private int diameter;
    private final double PHI = 22.0 / 7.0;

    public Bola(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double hitungLuasPermukaan() {
        return PHI * Math.pow(diameter, 2);
    }

    @Override
    public double hitungVolume() {
        return (PHI * Math.pow(diameter, 3)) / 6;
    }
}
