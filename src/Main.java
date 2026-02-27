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
    pet.setPESO(00.0);
    pet.setVACUNADO(false);
    System.out.println(pet.toString());

    //CREAR OBJETOS CON LOS DATOS INGRESADOS DEL USUARIO
    // SOLO SE CREA UN OBJETO, POR LO TANTO ESTWE YA NO ES NECESARIO, Mascota pet = new Mascota();
    System.out.println("INGRESE EL NOMBRE DE LA MASCOTA: ");
    pet.setNOMBRE(teclado.next());

    System.out.println("INGRESE LA ESPECIE DE LA MASCOTA: ");
    pet.setESPECIE(teclado.next());

    System.out.println("INGRESE LA EDAD DE LA MASCOTA: ");
    pet.setEDAD(teclado.nextInt());

    System.out.println("INGRESE EL PESO DE LA MASCOTA: ");
    pet.setPESO(teclado.nextDouble());

    //PARA INGRESAR LA RESPUESTA DE VACUNA RESPONDER SOLO TRUE O FALSE O DA ERROR
    System.out.println("INGRESE SI LA MASCOTA ES VACUNADA: ");
    pet.setVACUNADO(teclado.nextBoolean());

    System.out.println(pet.toString());

    //MENU CON DO-WHILE
    //EL DO-WHILE SE REPITE HASTA QUE OPCIÓN SEA 6
    int OPCIONES;
    do {
        System.out.println("         MENÚ VETERINARIA               ");
        System.out.println("1. MOSTRAR INFORMACIÓN");
        System.out.println("2. ALIMENTAR");
        System.out.println("3. VACUNAR");
        System.out.println("4. CUMPLIR AÑOS");
        System.out.println("5. MOSTRAR INFORMACIÓN FINAL");
        System.out.println("6. SALIR");
        System.out.print("INGRESE UNA OPCIÓN: ");
        OPCIONES = teclado.nextInt();

        switch (OPCIONES) {
            case 1:
                pet.MOSTRAR_INFORMACION();
                break;

            case 2:
                System.out.print("INGRESE LA CANTIDAD DE ALIMENTO EN KG: ");
                double cantidad = teclado.nextDouble();
                pet.ALIMENTAR(cantidad);
                break;

            case 3:
                pet.VACUNAR();
                break;

            case 4:
                pet.CUMPLIR_AÑOS();
                break;

            case 5:
                pet.MOSTRAR_INFORMACION();
                System.out.println("INFORMACIÓN FINAL MOSTRADA");
                break;

            case 6:
                System.out.println("PROGRAMA FINALIZADO");
                break;

            default:
                System.out.println("ERROR, INGRESE UNA OPCION");
        }

    } while (OPCIONES != 6);

    teclado.close();

}
