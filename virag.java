public class virag extends noveny {
    private String szin;

    public virag(int vizMennyiseg, String nev, String szin) {
        super(vizMennyiseg, nev);
        this.szin = szin;
    }

    @Override
    protected int getVizigeny() {
        return 5;
    }

    @Override
    protected double getOntozesArany() {
        return 0.75;
    }
}