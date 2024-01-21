abstract class Obrazec {
    public abstract double obvod();

    public abstract double obsah();

    @Override
    public abstract String toString();
}

class RovnostrannyTrojuhelnik extends Obrazec {
    private double hrana;

    public RovnostrannyTrojuhelnik(double hrana) {
        this.hrana = hrana;
    }

    @Override
    public double obvod() {
        return 3 * hrana;
    }

    @Override
    public double obsah() {
        return (Math.sqrt(3) / 4) * Math.pow(hrana, 2);
    }

    @Override
    public String toString() {
        return String.format("Jsem rovnostranný trojúhelník s hranou %.1f, s obvodem %.1f a obsahem %.15f",
                hrana, obvod(), obsah());
    }
}

class Kruh extends Obrazec {
    private double polomer;

    public Kruh(double polomer) {
        this.polomer = polomer;
    }

    @Override
    public double obvod() {
        return 2 * Math.PI * polomer;
    }

    @Override
    public double obsah() {
        return Math.PI * Math.pow(polomer, 2);
    }

    @Override
    public String toString() {
        return String.format("Jsem kruh s poloměrem %.1f, s obvodem %.1f a obsahem %.15f",
                polomer, obvod(), obsah());
    }
}

class Ctverec extends Obrazec {
    private double strana;

    public Ctverec(double strana) {
        this.strana = strana;
    }

    @Override
    public double obvod() {
        return 4 * strana;
    }

    @Override
    public double obsah() {
        return Math.pow(strana, 2);
    }

    @Override
    public String toString() {
        return String.format("Jsem čtverec o stranách %.1f a %.1f, s obvodem %.1f a obsahem %.1f",
                strana, strana, obvod(), obsah());
    }
}

class Obdelnik extends Obrazec {
    private double stranaA;
    private double stranaB;

    public Obdelnik(double stranaA, double stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
    }

    @Override
    public double obvod() {
        return 2 * (stranaA + stranaB);
    }

    @Override
    public double obsah() {
        return stranaA * stranaB;
    }

    @Override
    public String toString() {
        return String.format("Jsem obdélník o stranách %.1f a %.1f, s obvodem %.1f a obsahem %.1f",
                stranaA, stranaB, obvod(), obsah());
    }
}

public class Obrazce {
    public static void main(String[] args) {
        Obrazec[] tvary = new Obrazec[5];
        tvary[0] = new RovnostrannyTrojuhelnik(6);
        tvary[1] = new Kruh(3.5);
        tvary[2] = new Ctverec(2);
        tvary[3] = new Obdelnik(4, 11);
        tvary[4] = new Obdelnik(5, 5);

        for (Obrazec o: tvary)
            System.out.println(o);
    }
}
