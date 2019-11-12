package Entitati;

public abstract class FiguriGeometriceFactory {

    public static FiguraGeometrica creazaFigura (FiguriGeometrice figura) {

        FiguraGeometrica abcd = null;

        switch (figura) {
            case PATRAT:
                abcd = new Patrat();
                ((Patrat) abcd).setLatura(5);
                break;
            case DREPTUNGHI:
                abcd = new Dreptunghi();
                (( Dreptunghi)abcd) .setLungime(7);
                ((Dreptunghi)abcd) .setLatime(4);
                break;
            default:
                System.out.println("figura geometrica nu a fost definita");
                break;

        }

        return abcd;


    }


}
