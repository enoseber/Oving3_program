package sannsynlighet_oving3;

public class main {
    public static void main(String[] args) {
        double[] x =  {0.0,  0.3,  0.5,  0.6,  0.7,  0.8,  1.0,  1.2, 1.6};
        double[] Px = {0.0357, 0.0714, 0.1785, 0.2857, 0.1785, 0.1071, 0.0714, 0.0535, 0.0178}; // omgjort fra brøk

        StokastiskVariabel sv = new StokastiskVariabel(x, Px);

        System.out.println("E(X) = " + sv.regnUtForventning());
        System.out.println("Var(X) = " + sv.regnUtVarians());
        System.out.println("Standardavvik = " + sv.regnUtStandardavviket());
        double mellomFunksjon = sv.regnUtFordelingsfunksjonen(1.2) - sv.regnUtFordelingsfunksjonen(0.7);
        System.out.println("P(0.7 <= X <= 1.2) = " + mellomFunksjon);
    }
}
