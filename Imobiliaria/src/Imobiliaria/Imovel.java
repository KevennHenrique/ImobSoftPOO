package Imobiliaria;
public abstract class Imovel implements MenuImovel {
    private int quantQuartos;
    private int classe;
    private int tamanho;
    private float valor;
    private boolean suite;
    private boolean aVenda;
    private boolean alugavel;
    public static int numDeImoveis;

    public Imovel() {
    }

    public Imovel(int quantQuartos, int classe, int tamanho, boolean suite, boolean aVenda, boolean alugavel) {
        this.quantQuartos = quantQuartos;
        this.classe = classe;
        this.tamanho = tamanho;
        this.suite = suite;
        this.aVenda = aVenda;
        this.alugavel = alugavel;
    }

    public Imovel(int quantQuartos, int classe, int tamanho,boolean suite, float valor, boolean aVenda, boolean alugavel) {
        this.quantQuartos = quantQuartos;
        this.classe = classe;
        this.tamanho = tamanho;
        this.suite = suite;
        this.valor = valor;
        this.aVenda = aVenda;
        this.alugavel = alugavel;
    }
    

    @Override
    public abstract void status();
    //atualizarEstoque
    @Override
    public final void marcarComoVendido(){
        if (this.getaVenda()) {
           this.setaVenda(!this.getaVenda());
        } else {
            System.out.println("Esté imovel já está marcado como vendido.");
        }
    }
    @Override
    public final void reformado(){
        this.setClasse(5);
        System.out.println("Imovel reformado, agora ele é de classe: = 5 estrelas = ");
    }
    //fimAtualizarEstoque
    @Override
    public final void avaliarImovel() {
        System.out.println("Esté imovel foi avaliado em :  " + this.getValor()+"mil");
    } 
    public static void numDeImoveis(){
        System.out.println("Quantidade de imoveis já cadastrados nesta imobiliaria ao longo de sua existencia: "+numDeImoveis);
    }
    public int getQuantQuartos() {
        return quantQuartos;
    }

    public void setQuantQuartos(int quantQuartos) {
        this.quantQuartos = quantQuartos;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean getSuite() {
        return suite;
    }

    public void setSuite(boolean suite) {
        this.suite = suite;
    }

    public boolean getaVenda() {
        return aVenda;
    }

    public void setaVenda(boolean aVenda) {
        this.aVenda = aVenda;
    }

    public boolean getAlugavel() {
        return alugavel;
    }

    public void setAlugavel(boolean alugavel) {
        this.alugavel = alugavel;
    }
    
}
