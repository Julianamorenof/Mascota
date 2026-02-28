//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
void main() {
    Scanner teclado = new Scanner(System.in);

    //MENU CON DO-WHILE
    //EL DO-WHILE SE REPITE HASTA QUE OPCIÓN SEA 6
    List<Mascota>ltsMascota = new ArrayList<>();
    int OPCIONES;
    int OPCIONES1;
    do {
        System.out.println("   MENÚ VETERINARIA               ");
        System.out.println("1. CREAR MASCOTA");
        System.out.println("2. MOSTRAR TODO");
        System.out.println("3. BUSCAR POR NOMBRE");

        System.out.print("INGRESE UNA OPCIÓN: ");
        OPCIONES = teclado.nextInt();

        switch (OPCIONES) {
            case 1: {
                System.out.println("INGRESE EL NOMBRE DE LA MASCOTA: ");
                String NOMBRE = teclado.next();
                System.out.println("INGRESE LA ESPECIE DE LA MASCOTA: ");
                String ESPECIE = teclado.next();
                System.out.println("INGRESE LA EDAD DE LA MASCOTA: ");
                int EDAD = teclado.nextInt();
                System.out.println("INGRESE SI LA MASCOTA ESTA VACUNADA: ");
                String RTAVACUNA = teclado.next();
                boolean VACUNADO = false; // ES FALSO POR DEFECTO, AQUI ACTUALICE MI CODIGO ORIGINAL PARA OBTENER UN STRING COMO RESPUESTA Y FUNCIONE NORMAL

                if (RTAVACUNA.equalsIgnoreCase("S") ||
                        RTAVACUNA.equalsIgnoreCase("SI") ||
                        RTAVACUNA.equalsIgnoreCase("1")) {
                    VACUNADO = true;
                }
                System.out.println("INGRESE EL PESO DE LA MASCOTA");
                double PESO = teclado.nextDouble();

                Mascota m1 = new Mascota (NOMBRE, ESPECIE, EDAD, VACUNADO, PESO);
                ltsMascota.add(m1);
                break;
            }
            case 2: {
                System.out.println(ltsMascota);
                for (Mascota m : ltsMascota)
                    System.out.println(m);

                break;
            }
            case 3: {
                String nombremascota;
                System.out.println("BUSCAR POR NOMBRE");
                System.out.println("INGRESE EL NOMBRE A BUSCAR");
                nombremascota = teclado.next();

                Mascota masc1 = null;

                for (Mascota m : ltsMascota){
                    if (m.getNOMBRE().equalsIgnoreCase(nombremascota)){
                        masc1 = m;
                    }
                }

                System.out.println(masc1.toString());

                    System.out.println("""
                    SUBMENÚ VETERINARIA
                    1. ALIMENTAR MASCOTA
                    2. VACUNAR MASCOTA
                    3. CUMPLIR AÑOS
                    """);

                    System.out.print("INGRESE UNA OPCIÓN: ");
                    OPCIONES1 = teclado.nextInt();

                switch (OPCIONES1) {
                case 1:
                    System.out.print("INGRESE LA CANTIDAD DE ALIMENTO EN KG: ");
                    double cantidad = teclado.nextDouble();
                    masc1.ALIMENTAR(cantidad);
                    break;
                case 2:
                    masc1.VACUNAR();
                    System.out.println("VACUNADO");
                    break;

                case 3:
                    masc1.CUMPLIR_AÑOS();
                    break;
                }
            }

        }

    } while (OPCIONES != 3);


}
