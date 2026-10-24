package TechShop.Questão02;

public abstract class Produto {
    private String codigo;
    private String nome;
    private double precoBase;
    private int estoque;



    public Produto(String codigo, String nome, double precoBase, int estoque){
        this.codigo = codigo;
        this.nome = nome;
        setPrecoBase(precoBase);
        this.estoque = estoque;
    }

    public abstract double calcularPrecoFinal();
    public String exibirResumo(){
        return codigo + " - " + nome + ":" + " R$" + calcularPrecoFinal();
    }

    public void baixarEstoque(int quantidade){
        this.estoque -= quantidade;
    }

    private void setPrecoBase(double precoBase){
        if (precoBase < 0){
            throw new IllegalArgumentException("O preço não pode ser negativo!");
        }
        this.precoBase = precoBase;
    }

    protected double getPrecoBase(){
        return precoBase;
    }

    public int getEstoque(){
        return estoque;
    }

    public String getNome(){
        return nome;
    }
}
