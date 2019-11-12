package Entitati;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dreptunghi implements FiguraGeometrica {

    private double latime, lungime;

    @Override
    public double Perimetru() {
        return (latime * 2 + lungime * 2);

    }
}
