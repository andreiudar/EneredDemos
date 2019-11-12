import Entitati.FiguraGeometrica;
import Entitati.FiguriGeometrice;
import Entitati.FiguriGeometriceFactory;

public class Executie {
    public static void main(String[] args) {
        FiguraGeometrica x= FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.PATRAT);

        x.Perimetru();


    }



}
