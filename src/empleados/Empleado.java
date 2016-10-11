package empleados;

public class Empleado {
    private String nom;
    private final int souBase = 800;
    private int sou;
    private int souFinal;
    
    
    public Empleado(){}
    
    public Empleado(String nom, int sou) {
        this.nom = nom;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }
    
    public void setSouFinal() {
        this.souFinal= this.souBase + this.sou;
    }
    
    public int getSouFinal() {
        return souFinal;
    }
}