public class Mascota {

        private String NOMBRE;
        private String ESPECIE;
        private int EDAD;
        private boolean VACUNADO;
        private double PESO;

//CONSTRUCTOR VACIO
    public Mascota() {
    }
//CONSTRUCTOR CON PARAMETROS
    public Mascota(String NOMBRE, String ESPECIE, int EDAD, boolean VACUNADO, double PESO) {
        this.NOMBRE = NOMBRE;
        this.ESPECIE = ESPECIE;
        this.EDAD = EDAD;
        this.VACUNADO = false;
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

    public boolean getVACUNADO() {

        return VACUNADO;
    }

    public void setVACUNADO(boolean VACUNADO) {

        this.VACUNADO = VACUNADO;
    }

    public double getPESO() {

        return PESO;
    }

    public void setPESO(double PESO) {

        this.PESO = PESO;
    }

    // METODO TOSTRING VISTO EN CLASE (SI LO QUITO NO ME MUESTRA
    //LOS DATOS INICIALES POR DEFECTO DE LA MASCOTA

    @Override
    public String toString() {
        return "Mascota{" +
                "NOMBRE='" + NOMBRE + '\'' +
                ", ESPECIE='" + ESPECIE + '\'' +
                ", EDAD=" + EDAD +
                ", VACUNADO=" + VACUNADO +
                ", PESO=" + PESO +
                '}';
    }
    //METODO VACUNAR (SE UTILIZA UN METODO PARTICULAR NO TOSTRING,
    // PORQUE SE VAN A REALIZAR CAMBIOS ESPECIFICOS Y SE UTILIZA IF ELSE)
    //HAY QUE CONVERTIR EL BOOLEAN A STRING PARA QUE EL USUARIO PUEDA INGREAR SI O NO Y NO TRUE O FALSE SIN QUE DE ERROR
    //NECESITO EXPLICACION

    public boolean VACUNAR() {
        if (this.VACUNADO == false) {
            this.VACUNADO = true;
            System.out.println("LA MASCOTA YA ESTA VACUNADA");
            return this.VACUNADO;
        } else {
            System.out.println("LA MASCOTA YA ESTA VACUNADA");
            return this.VACUNADO;
        }
    }

    //METODO AUMENTAR PESO O ALIMENTAR (ES IGUAL QUE EL METODO ANTERIOR)
    public double ALIMENTAR(double CANTIDAD) {
        if (CANTIDAD > 0) {
            this.PESO = this.PESO + CANTIDAD;
            System.out.println("LA MASCOTA YA FUE ALIMENTADA");
            System.out.println("PESO ACTUALIZADO: " + this.PESO);
            return this.PESO;
        } else {
            System.out.println("NO SE PERMITEN CANTIDADES NEGATIVAS");
            return this.PESO;
        }
    }
//METODO CUMPLIR AÑOS
    public void CUMPLIR_AÑOS() {
        this.EDAD = this.EDAD + 1;
        System.out.println("LA MASCOTA CUMPLIO AÑOS");
        System.out.println("EDAD ACTUAL: " + this.EDAD);

        }
    //METODO MOSTRAR INFORMACION
    public void MOSTRAR_INFORMACION() {
            System.out.println("INFORMACION ACTUALIZADA DE LA MASCOTA");
            System.out.println("NOMBRE: "+ this.NOMBRE);
            System.out.println("ESPECIE: "+ this.ESPECIE);
            System.out.println("EDAD: "+ this.EDAD);
            System.out.println("PESO: "+ this.PESO);
            System.out.println("VACUNADO: "+ this.VACUNADO);
        }

    }




