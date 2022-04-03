import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Programa {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Teatro teatro1 = new Teatro("Lope de Vega", "Calle Ruiz");
        Funcion funcion1, funcion2, funcion3, funcion4;
        funcion1 = new Funcion("El rey leon", 60);
        funcion2 = new Funcion("Los miserables", 50);
        funcion3 = new Funcion("El Lazarillo de Tormes", 55);
        funcion4 = new Funcion("Billie Eliot", 70);

        boolean salir = false;
        int opcion = 0;
        System.out.println("Menú del teatro");

        do {
            System.out.println("\n1. Cambiar nombre del teatro\n2. Cambiar nombre de una función" +
                    "\n3. Cambiar precio de una funcion\n4. Salir");

            try {

                System.out.println("Escribe una de las opciones:");
                opcion = sc.nextInt();
                String opcion2 = sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("El nombre actual es " + teatro1.getNombre() +
                                "\nNuevo nombre del teatro: ");
                        String nuevonombre1 = sc.next();
                        teatro1.setNombre(nuevonombre1);
                        break;
                    case 2:
                        System.out.println("Escriba el nombre de la función a la que quiere cambiar de nombre:");
                        String respuesta = sc.nextLine();
                        if(Objects.equals(respuesta, funcion1.getNombre())){
                            System.out.println("Nuevo nombre de la función: ");
                            String nuevonombre2 = sc.next();
                            funcion1.setNombre(nuevonombre2);
                        }else if(Objects.equals(respuesta, funcion2.getNombre())){
                            System.out.println("Nuevo nombre de la función: ");
                            String nuevonombre2 = sc.next();
                            funcion2.setNombre(nuevonombre2);
                        }else if(Objects.equals(respuesta, funcion3.getNombre())){
                            System.out.println("Nuevo nombre de la función: ");
                            String nuevonombre2 = sc.next();
                            funcion3.setNombre(nuevonombre2);
                        }else if(Objects.equals(respuesta, funcion4.getNombre())){
                            System.out.println("Nuevo nombre de la función: ");
                            String nuevonombre2 = sc.next();
                            funcion4.setNombre(nuevonombre2);
                        } else{
                            System.out.println("Introduzca el nombre correcto");
                        }
                        break;
                    case 3:
                        System.out.println("Escriba el nombre de la función a la que quiere cambiar de precio:");
                        respuesta = sc.nextLine();
                        if(Objects.equals(respuesta, funcion1.getNombre())){
                            System.out.println("El precio actual es " + funcion1.getPrecio() +
                                    "\nNuevo precio de la función: ");
                            int nuevonombre3 = sc.nextInt();
                            funcion1.setPrecio(nuevonombre3);
                        }else if(Objects.equals(respuesta, funcion3.getNombre())){
                            System.out.println("El precio actual es " + funcion3.getPrecio() +
                                    "\nNuevo precio de la función: ");
                            int nuevonombre3 = sc.nextInt();
                            funcion2.setPrecio(nuevonombre3);
                        }else if(Objects.equals(respuesta, funcion3.getNombre())){
                            System.out.println("El precio actual es " + funcion3.getPrecio() +
                                    "\nNuevo precio de la función: ");
                            int nuevonombre3 = sc.nextInt();
                            funcion3.setPrecio(nuevonombre3);
                        }else if(Objects.equals(respuesta, funcion4.getNombre())){
                            System.out.println("El precio actual es " + funcion4.getPrecio() +
                                    "\nNuevo precio de la función: ");
                            int nuevonombre3 = sc.nextInt();
                            funcion4.setPrecio(nuevonombre3);
                        }
                        break;
                    case 4:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números del 1 al 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }while (opcion != 4);
    }
}
