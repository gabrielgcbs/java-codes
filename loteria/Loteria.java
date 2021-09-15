package loteria;

public class Loteria {
    public static void ImprimeMegaSena() {
        System.out.printf("\n**********MEGASENA**********\n\n");
        int contador = 1;
        int i, j;
        for(i=0; i<6; i++) {
            for(j=0; j<10; j++) {
                if(contador < 10) System.out.printf("0%d ", contador);
                else System.out.printf("%d ", contador);
                contador++;
            }
            System.out.printf("\n");
        }
    }
    public static void ImprimeLotoMania() {
        System.out.printf("\n**********LOTOMANIA**********\n\n");
        int contador = 1;
        int i, j;
        for(i=0; i<10; i++) {
            for(j=0; j<10; j++) {
                if(contador < 10) System.out.printf("0%d ", contador);
                else if (contador != 100) System.out.printf("%d ", contador);
                else System.out.printf("00");
                contador++;
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
