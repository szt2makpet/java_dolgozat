public class fa extends noveny {
    private String fajta;

    public fa(int vizMennyiseg, String nev, String fajta) {
        super(vizMennyiseg, nev);
        this.fajta = fajta;
    }

    @Override
    protected int getVizigeny() {
        return 10;
    }

    @Override
    protected double getOntozesArany() {
        return 0.4;
    }
}