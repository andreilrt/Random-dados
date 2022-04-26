package random.dados;

public class RandomDados {

    static int Lanzamiento() {
        int ValorDado = (int) Math.floor(Math.random() * 6 + 1);
        return ValorDado;
    }
    
    static void Resultado(int ValorDado, String Dado ){
        System.out.println("El valor del  "+Dado+" dado es: "+ValorDado);
    }

    static void Bienvenida() {
        System.out.println("Este programa simula el lanzamiento de dos dados"
                + ", por lo tanto se generan dos numeros aleatorios entre 1 y 6\n");
    }
    
    static void Proceso(){
        Bienvenida();
        Resultado(Lanzamiento(), "primer");
        Resultado(Lanzamiento(), "segundo");
    }

    public static void main(String[] args) {
        Proceso();
    }
}
