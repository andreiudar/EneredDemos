package Entitati;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Patrat implements FiguraGeometrica {
    private double latura;

    @Override

    public double Perimetru() {

        System.out.println("latura patratului este  ");
        return latura * 4;
    }
}
