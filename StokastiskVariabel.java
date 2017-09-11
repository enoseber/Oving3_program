package sannsynlighet_oving3;

public class StokastiskVariabel {

    double[] x;
    double[] Px;

    public StokastiskVariabel(double[] x, double[] Px){
        this.x = x;
        this.Px = Px;
    }

    public double regnUtForventning(){
        double v = 0;

        for (int i = 0; i < x.length; i++) {
            v += x[i] * Px[i];
        }

        return v;
    }

    public double regnUtVarians(){
        double v = 0;
        double Ex = regnUtForventning();

        for (int i = 0; i < x.length; i++) {
            v += Math.pow(x[i], 2) * Px[i];
        }

        v -= Math.pow(Ex, 2);

        return v;
    }

    public double regnUtStandardavviket(){
        double v = regnUtVarians();

        return Math.sqrt(v);
    }

    public double regnUtFordelingsfunksjonen(double grense){
        float v = 0;

        for (int i = 0; i < x.length; i++) {
            if(x[i] <= grense){
                v += Px[i];
            } else {
                break;
            }
        }

        return v;
    }
}
