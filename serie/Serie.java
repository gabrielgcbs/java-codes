package serie;

public class Serie {
    private int inicio;
    private int multiplicador;
    private int adicional;

    public Serie(int inicio, int multiplicador, int adicional) {
        this.inicio = inicio;
        this.multiplicador = multiplicador;
        this.adicional = adicional;
    }

    public void imprime(int num_termos) {
        int termo_anterior = this.inicio;
        int termo_atual;
        int i;
        for(i=0; i<num_termos; i++) {
            if(i==0) System.out.printf("%d ", this.inicio);
            else {
                termo_atual = (termo_anterior + this.adicional)*this.multiplicador;
                System.out.printf("%d ", termo_atual);
                termo_anterior = termo_atual;
            }
        }
        System.out.println("");
    }
}
