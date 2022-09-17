package tp1;

import java.util.Scanner;

public class TestJuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        Robot rob = new Robot();
        int pasos = 0, aux = 0, opcionBat = 0;
        Hombre homb1 = new Hombre("Juan");
        Hombre homb2 = new Hombre("Rosa");
        Hombre jugador = homb1;

        //Informar la modalidad de uso en un menu o lista de opciones.
        do {
            System.out.println("************ MENU *************");
            System.out.println("**** Seleccione una opción ****");
            System.out.println("1 - Juego automático (JugarConRobot())");
            System.out.println("2 - Avanzar");
            System.out.println("3 - Retroceder");
            System.out.println("4 - Dormir");
            System.out.println("5 - Despertar");
            System.out.println("6 - Recargar");
            System.out.println("7 - Consultar bateria"); // elegir entre los tres metodos del robot
            System.out.println("8 - Cambiar jugador"); // elegir entre los tres metodos del robot
            System.out.println("10 - Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //1 - Juego automático (JugarConRobot())
                    System.out.println("\nHola! " + jugador.getNombreID() + "\nVamos a jugar.");
                    jugador.jugarConRobot(rob);
                    break;
                case 2:
                    //2 - Avanzar
                    System.out.println("Ingrese cantidad de pasos a avanzar");
                    pasos = sc.nextInt();
                    aux = rob.avanzar(pasos);
                    if (aux == pasos) {
                        System.out.println("Avance " + aux + " pasos indicados.");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    } else {
                    if (aux >= 0) {
                        System.out.println("Solo pude avanzar: " + aux + " pasos.");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    } else {
                        System.out.println("No hubo movimiento, debe recargar mi bateria!");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    }
                    }
                    break;
                case 3:
                    //3 - Retroceder
                    System.out.println("Ingrese cantidad de pasos a retorceder");
                    pasos = sc.nextInt();
                    aux = rob.retroceder(pasos);
                    if (aux == pasos) {
                        System.out.println("Retrocedi " + aux + " pasos indicados.");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    } else {
                    if (aux >= 0) {
                        System.out.println("Solo pude retroceder: " + aux + " pasos.");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    } else {
                        System.out.println("No hubo movimiento, debe recargar mi bateria!");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    }
                    }
                    break;
                case 4:
                    //4 - Dormir
                    rob.dormir();
                    System.out.println("El robot se durmio...\nEstado activo: " + rob.isActivo() + "\n- - - - - - - - - - - - - -");
                    break;
                case 5:
                    //5 - Despertar
                    if (rob.isActivo()) {
                        if (rob.energiaActual() > 0) {
                            rob.despertar();
                            System.out.println("Despertando... \nEstado activo: " + rob.isActivo() + "\n- - - - - - - - - - - - - -");
                        } else {
                            System.out.println("Debe recargar bateria!!");
                        }
                    }

                    break;
                case 6:
                    //6 - Recargar
                    rob.recargar();
                    System.out.println("Bateria Recargada!!");
                    break;
                case 7:
                    //7 - Consultar bateria
                    System.out.println("**** Seleccione una opción ****");
                    System.out.println("1 - Consultar bateria llena)");
                    System.out.println("2 - Consultar bateria vacia");
                    System.out.println("3 - Consultar bateria actual");
                    opcionBat = sc.nextInt();
                    switch (opcionBat) {
                        case 1:
                            if (rob.bateriaLlena()) {
                                System.out.println("La bateria esta llena");
                            } else {
                                System.out.println("La bateria NO esta llena");
                            }
                            break;
                        case 2:
                            if (rob.bateriaVacia()) {
                                System.out.println("La bateria esta Vacia");
                            } else {
                                System.out.println("La bateria NO esta Vacia");
                            }
                            break;
                        case 3:
                            System.out.println("La bateria tiene " + rob.energiaActual() + " de energia");
                            break;
                    }
                    break;
                case 8:
                    //
                    if (jugador == homb1) {
                        jugador = homb2;
                    } else {
                        jugador = homb1;
                    }
                    break;
            }
        } while (opcion != 10);

        
    }
}
