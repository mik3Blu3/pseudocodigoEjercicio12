import java.util.Scanner;
public class A2E12 
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args [])
    {
        int salir = 0;
        double alturaPromedioMujer=0;
        double alturaPromedioHombre =0;
        int promedioEdad = 0;
        int contadorEdad = 0;
        int contadorMujer = 0;
        int contadorHombre =0;
        double promedioAlturaHombreReal = 0;
        double promedioAlturaMujerReal = 0;
        System.out.println("Ingrese los datos que se le piden a continuacion:");
        do
        {
            System.out.println("Ingrese  la altura de la persona: (mts)");
            double altura = entrada.nextDouble();
            if(altura < 0)
            {
                System.out.println("");
                System.out.println("La altura es negativa por ende termina el programa");
                System.out.println("");
                salir++;
            }else{
                System.out.println("Ingrese la edad de la persona : (años)");
                int edad =entrada.nextInt();
                promedioEdad = (promedioEdad+edad);
                contadorEdad = (contadorEdad+1);
                System.out.println("Ingrese el sexo de la persona : (F/M)");
                String sexoPersona = entrada.next();
                if(sexoPersona.equalsIgnoreCase("f"))
                {
                    alturaPromedioMujer = (alturaPromedioMujer+altura);
                    contadorMujer = (contadorMujer+1);
                }
                if(sexoPersona.equalsIgnoreCase("m"))
                {
                    alturaPromedioHombre = (alturaPromedioHombre+altura);
                    contadorHombre = (contadorHombre+1);
                }
            }
        }while(salir !=1);
        if(contadorMujer == 0)
        {
            System.out.println("No existen datos de mujeres  almacenados");
            System.out.println("");
        }
        if(contadorMujer != 0)
        {
            promedioAlturaMujerReal = (alturaPromedioMujer/contadorMujer);
            System.out.println("El promedio de la altura de las mujeres es de: "+promedioAlturaMujerReal+ " mts");
            System.out.println("");
        }
        if(contadorHombre != 0)
        {
            promedioAlturaHombreReal = (alturaPromedioHombre/contadorHombre);
            System.out.println("El promedio de la altura de los hombres es de: "+promedioAlturaHombreReal+" mts");
            System.out.println("");
        }
        if(contadorHombre == 0)
        {
            System.out.println("No existen datos de hombres almacenados");
            System.out.println("");
        }
        if(contadorEdad != 0)
        {
            int promedioEdadTotal = (promedioEdad/contadorEdad);
            System.out.println("El promedio de edad de los participantes es de: "+promedioEdadTotal+" años");
            System.out.println("");
        }
        if(contadorEdad == 0)
        {
            System.out.println("No existen datos de edades almacenados");
            System.out.println("");
        }
    }
}