package ico.fes;

/**
 *
 * @author 52551
 */
public class Aritmetica {
    int a;
    int b;

    public Aritmetica() {
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int sumar() {
        return this.a + this.b;
    }
    
    public int restar() {
        return this.a - this.b;
    }
    
    public int multiplicar() {
        return 0;
    }
}
