//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner teclado = new Scanner(System.in);

  /*  do{
        System.out.println("VETERINARIA");
        System.out.println("INFORMACIÓN");
    }
    /*/
    //OBJETO CREADO DESDE EL CONSTRUCTOR VACIO
    Mascota pet = new Mascota();

    pet.setNOMBRE("PEPITO");
    pet.setESPECIE("PEPITO");
    pet.setEDAD(00);
    pet.setVACUNADO(false);
    pet.setPESO(00.0);
    System.out.println(pet.toString());



    //CREAR OBJETOS CON LOS DATOS INGRESADOS DEL USUARIO
    Mascota pet1 = new Mascota();
    System.out.println("INGRESE EL NOMBRE DE LA MASCOTA");
    pet1.setNOMBRE(teclado.next());



}
