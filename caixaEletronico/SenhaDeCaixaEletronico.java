package caixaEletronico;

import java.util.Scanner;

public class SenhaDeCaixaEletronico {

    private int senha;

    public void CadastrarSenha() {
        int senha_temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("**********Seja bem-vindo(a)!**********\n");
        System.out.print("\nInsira uma senha numérica:\t");
        this.senha = sc.nextInt();
        do {
            System.out.print("Insira a senha novamente:\t");
            senha_temp = sc.nextInt();
            if(senha_temp != this.senha) System.out.print("Senhas diferentes, tente novamente!\n");
        } while (this.senha != senha_temp);
        System.out.println("**********Senha cadastrada com sucesso!**********\n");
    }

    public void InserirSenha() {
        int tentativas = 3;
        int senha_temp;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Acesse sua conta**********\n");
        System.out.print("Insira sua senha: (Você tem " + tentativas + " tentativas)\t");
        do {
            senha_temp = sc.nextInt();
            contador++;
            if(senha_temp == this.senha) {
                System.out.println("Login realizado com sucesso...");
                return;
            }
            else if(contador < tentativas) {
                System.out.printf("Senha incorreta, você tem mais %d tentativas\t", tentativas - contador);
            }
            else System.out.println("ERRO. Número máximo de tentativas alcançado.");
        } while (contador < tentativas);
    }
}
