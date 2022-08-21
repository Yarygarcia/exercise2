import java.util.Scanner;

public class Main {
    public static int indiceMenor(Suma vehiculos[]){
        int indice=0;
        float precio = vehiculos[indice].getPrecio();

        for(int z =1; z < vehiculos.length; z++){
            if(vehiculos[z].getPrecio() < precio){
                precio = vehiculos[z].getPrecio();
                indice =z;
            }
        }
        return indice;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner((System.in));
        String marca, modelo;
        float precio;
        System.out.print("Ingrese el numero de vehiculos ");
        int cantidad = entrada.nextInt();
        Suma vehiculos[] = new Suma[cantidad];
        for( int i = 0; i < vehiculos.length; i++){
            entrada.nextLine();
            System.out.println("Vehiculo " +(i+1) + " ");
            System.out.print("Marca: ");
            marca = entrada.nextLine();
            System.out.print("Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Precio: ");
            precio = entrada.nextFloat();
            vehiculos[i] = new Suma(marca, modelo, precio);
        }
        int num = indiceMenor(vehiculos);
        System.out.print("El menor es\n");
        vehiculos[num].imprimir();
    }
}
