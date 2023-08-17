package controller;
import model.Produto;
public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto("Correia", "Correia dentada do motor", 228.75, 43);
        System.out.println(produto1);
    }
}
