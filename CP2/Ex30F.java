package estrutura_repeticao;

public class Ex30F {

	public static void main(String[] args) {
        int primeiro = 1;
        int segundo = 1;
        int terceiro = 1;
        int quarto = terceiro + segundo + primeiro;
        int quinto;

        for (int i = 0; i <= 20; i++) {
            quinto = quarto + terceiro + segundo;
            segundo = terceiro;
            terceiro = quarto;
            quarto = quinto;
            System.out.printf("\n %d", quinto);
        }
    }
}