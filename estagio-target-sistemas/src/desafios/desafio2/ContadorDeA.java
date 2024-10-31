package desafios.desafio2;

public class ContadorDeA {
    public static void main(String[] args) {
        String input = "Amarelo";

        int contador = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) existe na palavra '" + input + "'");
            System.out.println("Quantidade de vezes que 'a' aparece: " + contador);
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não existe na string.");
        }
    }
}
