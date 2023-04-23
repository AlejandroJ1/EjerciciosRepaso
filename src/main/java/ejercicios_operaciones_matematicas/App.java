package ejercicios_operaciones_matematicas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*
         * //Suma,resta,multiplicacion y division de dos valores.
         * int x = 144;
         * int y = 999;
         * int suma = x + y;
         * int resta = x - y;
         * double multiplicacion = (double) x * (double) y;
         * double division = (double) x / (double) y;
         * System.out.println("La suma ente x e y es:" + suma);
         * System.out.println("La resta entre x e y es:" + resta);
         * System.out.println("La multiplicacion entre x e y es:" + multiplicacion);
         * System.out.println("La division entre x e y es:" + division);
         */

        /*
         * //pasar de euros a pesetas
         * Scanner sc = new Scanner(System.in);
         * double euro;
         * double peseta;
         * 
         * System.out.println("¿Cuantos euros quieres pasar a pesetas?:");
         * euro = sc.nextDouble();
         * 
         * peseta = euro * 166.386;
         * System.out.println( euro + " euros " + "= " + peseta + " pesetas");
         */

        /*
         * //aplicar el iva a una base
         * double baseImponible = 200.00;
         * double iva = 0.21;
         * double total = baseImponible * iva;
         * System.out.println("El precio total es: " + total);
         */

        /*
         * char letra = 'A';
         * String cadena = "ABC"
         * 
         * System.out.println("Juntamos el char" + letra + "con el String" + cadena);
         */

        /*
         * //Concatenar varios char en una String
         * char letra1 = 'A';
         * char letra2 = 'B';
         * char letra3 = 'C';
         * char letra4 = 'D';
         * char letra5 = 'E';
         * 
         * String cadena = letra1 + "" + letra2 + "" + letra3 + "" + letra4 + "" +
         * letra5;
         * System.out.println(cadena);
         */

        /*
         * //Ejercicio con Scanner meter dos numeros y que de la muliplicacion de los
         * numeros
         * Scanner sc = new Scanner(System.in);
         * int numero1;
         * int numero2;
         * 
         * System.out.println("Introduzca dos numeros:");
         * 
         * numero1 = sc.nextInt();
         * numero2 = sc.nextInt();
         * 
         * int multiplicacion = numero1 * numero2;
         * 
         * System.out.println("El resultado de la multiplicacion de " + numero1 + " y "
         * + numero2 + " es: " + multiplicacion);
         */

        /*
         * //Introducir dos numeros con scanner y hacer todas las operaciones con eso
         * numeros
         * Scanner sc = new Scanner(System.in);
         * int x;
         * int y;
         * 
         * System.out.println("Introduzca dos numeros:");
         * x = sc.nextInt();
         * y = sc.nextInt();
         * int suma = x + y;
         * int resta = x - y;
         * int multiplicacion = x * y;
         * double division =(double) x /(double) y;
         * System.out.println("Suma: " + suma);
         * System.out.println("Resta: " + resta);
         * System.out.println("Multiplicacion: " + multiplicacion);
         * System.out.println("Division: " + division);
         */

        /*
         * //Calcular el area de un triangulo
         * Scanner sc = new Scanner(System.in);
         * int base;
         * int altura;
         * 
         * System.out.println("Introduzca la base del triangulo:");
         * base = sc.nextInt();
         * System.out.println("Introduzca la altura del triangulo:");
         * altura = sc.nextInt();
         * 
         * double area = (double)base * (double)altura / 2;
         * 
         * System.out.println("El area del tringulo con base " + base + " y altura " +
         * altura + " es " + area);
         */

        /*
         * //Calcular lo que cobra un trabajador en una semana
         * Scanner sc = new Scanner(System.in);
         * double salario_semanal;
         * int horas_trabajadas;
         * int paga_por_hora = 12;
         * System.out.
         * println("Introduce las horas que trabaja este trabajador por semana:");
         * horas_trabajadas = sc.nextInt();
         * salario_semanal = horas_trabajadas * paga_por_hora;
         * System.out.println("Horas trabajadas: " + horas_trabajadas);
         * System.out.println("El salario semanal es: " + salario_semanal);
         */

        /*
         * //Calcular la nota que hay que sacar en en examen2 para la nota deseada
         * Scanner sc = new Scanner(System.in);
         * double nota1;
         * double mediaDeseada;
         * double pesoExamen1 = 0.4;
         * double pesoExamen2 = 0.6;
         * System.out.println("La nota del primer examen es:");
         * nota1 = sc.nextDouble();
         * System.out.println("La nota deseada es:");
         * mediaDeseada = sc.nextDouble();
         * double nota2 = (mediaDeseada - nota1 * pesoExamen1) / pesoExamen2;
         * 
         * System.out.println("Para obtener una media de " + mediaDeseada +
         * " necesitas sacar un " + nota2 + " en el segundo examen.");
         */

        /*
         * //Poner numero y te dice día de la semana
         * 
         * Scanner sc = new Scanner(System.in);
         * int numero_semana;
         * String nombre_semana = "";
         * 
         * System.out.println("Dime un día de la semana(numericamente)");
         * numero_semana = sc.nextInt();
         * 
         * switch(numero_semana){
         * case 1:
         * nombre_semana = "Lunes";
         * break;
         * case 2:
         * nombre_semana = "Martes";
         * break;
         * case 3:
         * nombre_semana = "Miercoles";
         * break;
         * case 4:
         * nombre_semana = "Jueves";
         * break;
         * case 5:
         * nombre_semana = "Viernes";
         * break;
         * case 6:
         * nombre_semana = "Sabado";
         * break;
         * case 7:
         * nombre_semana = "Domingo";
         * break;
         * 
         * default:
         * System.out.
         * println("No existe un día de la semana relacionado con ese numero.");
         * 
         * }
         * System.out.println("El numero " + numero_semana + " es igual al " +
         * nombre_semana);
         */

        /*
         * //calcular lo que se cobra con 40 y más de 40 horas
         * final int SUELDO = 12;
         * final int SUELDO_MAYOR_CUARENTA = 16;
         * Scanner sc = new Scanner(System.in);
         * int horas;
         * int sueldo_total;
         * System.out.println("¿Cuantas horas a trabajado en la semana?:");
         * horas = sc.nextInt();
         * 
         * if(horas > 40){
         * sueldo_total = (40 * SUELDO) + (horas - 40) * SUELDO_MAYOR_CUARENTA;
         * }else{
         * sueldo_total = horas * SUELDO;
         * }
         * 
         * System.out.println("El sueldo semanal es " + sueldo_total);
         */

        /*
         * //Ecuacion de primer grado(ax+b=0)
         * Scanner sc = new Scanner(System.in);
         * double a;
         * System.out.println("Dime el valor de a:");
         * a = sc.nextDouble();
         * double b;
         * System.out.println("Dime el valor de b:");
         * b = sc.nextDouble();
         * double x;
         * if (a == 0) {
         * System.out.println("Ecuacion indeterminada(no podemos dividir b entre 0)");
         * } else if (b == 0) {
         * System.out.println("Ecuacion indeterminada(no podemos divir 0 entre a)");
         * } else {
         * x = -b / a;
         * System.out.println("La solucion es:" + x);
         * }
         */

        /*
         * //aplicar formula a t =√2h/g siendo g = 9.81m/s2
         * final double GRAVEDAD = 9.81;
         * Scanner sc = new Scanner(System.in);
         * double altura;
         * System.out.println("Dime la altura para aplicar la formula:");
         * altura = sc.nextDouble();
         * double tiempo;
         * 
         * tiempo = Math.sqrt(2*altura/GRAVEDAD);
         * 
         * System.out.println("El tiempo que tarda es:" + tiempo);
         */
    }
}
