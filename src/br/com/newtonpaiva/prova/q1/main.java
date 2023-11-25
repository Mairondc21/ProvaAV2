package br.com.newtonpaiva.prova.q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Arvore arvore = new Arvore();

        Scanner ler = new Scanner(System.in);
        Scanner sc = new Scanner(new File("C:\\Users\\12111752\\Downloads\\dados.txt"));

        Arvore.Node no = null;

        System.out.println("digite a opcao desejada - 1: Inserir " +
                "- 2: Excluir - 3: Pesquisar - 4: pre-ordem - 5:Sair");
        int num = ler.nextInt();


        switch (num){
            case 1:
                while(sc.hasNext()) {
                    int valor = Integer.parseInt(sc.nextLine().trim());
                    no = arvore.insert(no, valor);
                    arvore.print(no);
                }
                break;
            case 2:
                while(sc.hasNext()) {
                    int valor = Integer.parseInt(sc.nextLine().trim());
                    no = arvore.deleteNode(no, valor);
                    arvore.print(no);
                }
                break;
            case 3:
//                while(sc.hasNext()) {
//                    int valor = Integer.parseInt(sc.nextLine().trim());
//                    no = arvore.getBalance();
//                    arvore.print(no);
//                }
                break;
            case 4:
                while(sc.hasNext()) {
                    arvore.preOrder(no);
                    System.out.println(no);
                }

                break;
            default:
                System.out.println("dgite 5 para sair");
                ler.nextInt();

        }



    }
}
