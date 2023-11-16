public class Main {
    public static void main(String[] args) {
        noveny sargaVirag = new virag(0, "sárga virág", "sárga");
        noveny kekVirag = new virag(0, "kék virág", "kék");
        noveny loncFa = new fa(0, "lonc fa", "lonc");
        noveny narancsFa = new fa(0, "narancs fa", "narancs");

        sargaVirag.ontzes(40);
        kekVirag.ontzes(40);
        loncFa.ontzes(40);
        narancsFa.ontzes(40);

        System.out.println("\n70-es locsolás: \n");

        sargaVirag.ontzes(70);
        kekVirag.ontzes(70);
        loncFa.ontzes(70);
        narancsFa.ontzes(70);

    }
}
