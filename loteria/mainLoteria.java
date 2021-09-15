package loteria;

import java.util.Scanner;

public class mainLoteria {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int op;
        Loteria lot = new Loteria();
        do {
            System.out.printf("\nQual opção deseja visualizar?\n(1)MEGASENA\n(2)LOTOMANIA\n(0)SAIR\n");
            op = sc.nextInt();
            while(op<0 || op>2) {
                System.out.printf("Opção inválida. Tente novamente.\n");
                op = sc.nextInt();
            }
            switch (op) {
                case 1:
                    lot.ImprimeMegaSena();
                    break;
                case 2:
                    lot.ImprimeLotoMania();
                    break;
                default:
                    System.out.printf("Saindo...");
            }
        } while (op != 0);

    }
}
