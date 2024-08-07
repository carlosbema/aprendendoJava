package aulas;

import java.util.Locale;

public class saida {

    public static void main(String[] args) {
        int x = 25;
        double y = 10.4324;
        System.out.println("Println da uma quebra de linha"); 
        System.out.print("Print não da quebra de linha");
        System.out.println("Por isso o texto está grudado");
        System.out.println(x);
        Locale.setDefault(Locale.US); //Locale muda a formatação para a padrão de outro local
        System.out.printf("%.5f\n", y); /*Printf é utilizado como fstring,
        o primeiro argumento é %.[n casas]f, \n quebra a linha, e o valor numérico
        é o segundo argumento.
        */
        System.out.printf("Resultado: %.2f metros%n", y);
        String nome = "Carlos";
        int idade = 24;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos de idade e recebe R$%.2f por mês", nome, idade, renda);
    }
}

