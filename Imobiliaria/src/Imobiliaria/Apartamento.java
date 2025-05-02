package Imobiliaria;
public final class Apartamento extends Imovel {
    private boolean lavanderia;
    private boolean estacionamento;
    private int andar;

    public Apartamento(boolean lavanderia, boolean estacionamento, boolean suite, int andar, int quantQuartos, int classe, int tamanho, boolean aVenda, boolean alugavel) {
        super(quantQuartos, classe, tamanho, suite, aVenda, alugavel);
        this.lavanderia = lavanderia;
        this.estacionamento = estacionamento;
        this.andar = andar;
        numDeImoveis=numDeImoveis+1;
        this.setValor(quantQuartos, tamanho, suite, classe, lavanderia, estacionamento,andar);
    }

    public Apartamento(boolean lavanderia, boolean estacionamento, boolean suite, int andar, int quantQuartos, int classe, int tamanho, boolean aVenda, boolean alugavel, float valor) {
        super(quantQuartos, classe, tamanho, suite, valor ,aVenda, alugavel );
        this.lavanderia = lavanderia;
        this.estacionamento = estacionamento;
        this.andar = andar;
        numDeImoveis=numDeImoveis+1;
    }
    //sobrecarga no metodo especial setValor
    public void setValor(int qtQuartos,int tamanho, boolean suite, int classe, boolean lavanderia, boolean estacionamento, int andar) {
        
        this.setValor(50);//valor inicial de qualquer casa
        
        if (lavanderia)
            this.setValor(this.getValor()+20);
        if(estacionamento)
            this.setValor(this.getValor()+20);
        if(suite){
            this.setValor(this.getValor()+20);
        }
        this.setValor(this.getValor()+(andar*5));
        this.setValor(this.getValor()+(qtQuartos*20));
        this.setValor(this.getValor()+(classe*10));
        this.setValor(this.getValor()+(tamanho/4));
    }
    
    @Override
    public void status() {
        System.out.println("Tamanho da casa: "+this.getTamanho()+" m^2"+
                "\nQuantidade de quartos: "+this.getQuantQuartos()+"\nPossui suites: "+this.getSuite()+
                "\nApartamento de Classe: "+ this.getClasse()+"\nPossui lavanderia: "+this.getLavanderia()
                +"\nPossui estacionamento: "+this.getEstacionamento()+"\nEsta no andar : "+this.getAndar());
    }

    public boolean getLavanderia() {
        return lavanderia;
    }

    public void setLavanderia(boolean lavanderia) {
        this.lavanderia = lavanderia;
    }

    public boolean getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
    
}
