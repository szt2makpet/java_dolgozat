public class noveny {
    protected int vizMennyiseg; // water quantity
    protected String nev; // name

    public noveny(int vizMennyiseg, String nev) {
        this.vizMennyiseg = vizMennyiseg;
        this.nev = nev;
    }

    public boolean vizSzukseges() {
        return vizMennyiseg < getVizigeny();
    }

    public void ontzes(int vizMennyiseg) {
        if (vizSzukseges()) {
            this.vizMennyiseg += vizMennyiseg * getOntozesArany();
            System.out.println("A " + nev + "nak vízre van szüksége");
        } else {
            System.out.println("A " + nev + "nak nincs szüksége vízre");
        }
    }

    protected int getVizigeny() {
        return 0;
    }

    protected double getOntozesArany() {
        return 0.0;
    }
}