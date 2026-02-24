public class Mascota {


        private String NOMBRE;
        private String ESPECIE;
        private int EDAD;
        private Boolean VACUNADO;
        private double PESO;

//CONSTRUCTOR VACIO
    public Mascota() {
    }
//CONSTRUCTOR CON PARAMETROS
    public Mascota(String NOMBRE, String ESPECIE, int EDAD, Boolean VACUNADO, double PESO) {
        this.NOMBRE = NOMBRE;
        this.ESPECIE = ESPECIE;
        this.EDAD = EDAD;
        this.VACUNADO = VACUNADO;
        this.PESO = PESO;
    }

 //GET AND SET

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getESPECIE() {
        return ESPECIE;
    }

    public void setESPECIE(String ESPECIE) {
        this.ESPECIE = ESPECIE;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public Boolean getVACUNADO() {
        return VACUNADO;
    }

    public void setVACUNADO(Boolean VACUNADO) {
        this.VACUNADO = VACUNADO;
    }

    public double getPESO() {
        return PESO;
    }

    public void setPESO(double PESO) {
        this.PESO = PESO;
    }
}

