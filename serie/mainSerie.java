package serie;

public class mainSerie {
    public static void main(String[] args){
        Serie s1 = new Serie(0, -2, 2);
        s1.imprime(10);
        Serie s2 = new Serie(1,2,0);
        s2.imprime(12);
        Serie s3 = new Serie(1,1,2);
        s3.imprime(14);
    }
}
