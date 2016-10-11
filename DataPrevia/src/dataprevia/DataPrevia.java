package dataprevia;
/**
 * @author Anas
 */

public class DataPrevia {
    private int dia;
    private int mes;
    private int any;

    public DataPrevia(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public DataPrevia() {}

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
    
    public void DataAnterior()
    {
        if (this.dia==1 && this.mes>1)
        {
            this.dia=31;
            this.mes--;
        }
        else if (this.dia==1 && this.mes==1)
        {
            this.dia=31;
            this.mes=12;
            this.any--;
        }
        else
        {
            this.dia--;
        }
    }
}
