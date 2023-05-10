package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        System.out.println("Testes e Qualidade de Software");
        Produto meuProduto = new Produto();
        meuProduto.nome = "Pay Station 4";
        meuProduto.valor = 4999.99;
        meuProduto.marca = "Sony";
        meuProduto.tamanho = "Medio";
        meuProduto.itensInclusos = "2 Controles e 3 Jogos";
        System.out.println(meuProduto.nome);


    }
}
