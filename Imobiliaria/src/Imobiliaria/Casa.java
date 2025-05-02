package Imobiliaria;
public final class Casa extends Imovel {
    private boolean quintal;
    private boolean garagem;
    private boolean piscina; 
    
    //metodos construtores
    
    public Casa(int quantQuartos, int classe, int tamanho, boolean suite, boolean aVenda, boolean alugavel, boolean quintal, boolean garagem, boolean piscina,float valor) {
        super(quantQuartos, classe, tamanho,suite , valor, aVenda, alugavel);
        this.quintal = quintal;
        this.garagem = garagem;
        this.piscina = piscina; 
        numDeImoveis=numDeImoveis+1;
    }

    public Casa(int quantQuartos, int classe, int tamanho, boolean suite, boolean aVenda, boolean alugavel, boolean quintal, boolean garagem, boolean piscina) {
        super(quantQuartos, classe, tamanho, suite, aVenda, alugavel);
        this.quintal = quintal;
        this.garagem = garagem;
        this.piscina = piscina;
        this.setValor(quantQuartos, tamanho, suite, classe, quintal, garagem, piscina);
        numDeImoveis=numDeImoveis+1;
    }
    //sobrecarga no metodo especial setValor
    public void setValor(int qtQuartos,int tamanho, boolean suite, int classe, boolean quintal, boolean garagem, boolean piscina) {
        
        this.setValor(50);//valor inicial de qualquer casa
        
        if (piscina)
            this.setValor(this.getValor()+20);
        if(garagem)
            this.setValor(this.getValor()+20);
        if(quintal)
            this.setValor(this.getValor()+20);
        if(suite){
            this.setValor(this.getValor()+20);
        }
        this.setValor(this.getValor()+(qtQuartos*20));
        this.setValor(this.getValor()+(classe*10));
        this.setValor(this.getValor()+(tamanho/4));
    }
    
    @Override
    public void status() {
        System.out.println("Tamanho da casa: "+this.getTamanho()+" m^2"+
                "\nQuantidade de quartos: "+this.getQuantQuartos()+"\nPossui suites: "+this.getSuite()+
                "\nCasa de Classe: "+ this.getClasse()+"\nPossui quintal: "+this.getQuintal()
                +"\nPossui garagem: "+this.getGaragem()+"\nPossui Piscina : "+this.getPiscina()+
                "\nPossui a venda : "+this.getaVenda()+"\nPossui alugavel : "+this.getAlugavel());
    }
    
    public boolean getQuintal() {
        return quintal;
    }

    public void setQuintal(boolean quintal) {
        this.quintal = quintal;
    }

    public boolean getGaragem() {
        return garagem;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
}
