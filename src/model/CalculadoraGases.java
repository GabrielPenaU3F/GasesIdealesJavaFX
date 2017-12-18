package model;

public class CalculadoraGases {

    private final Double R = 0.082;

    public Double calcularTemperatura(Double presionDouble, Double volumenDouble, Integer molesInt) {

        Double PV = presionDouble * volumenDouble;
        Double nR = R * molesInt;

        Double temp = PV / nR;
        return temp;

    }

}
