package Ex11;

public class BackEnd extends TecnologiasDesenvolvimento implements Tecnologia {

    private boolean conteinerizacao;

    public boolean isConteinerizacao() {
        return this.conteinerizacao;
    }

    public boolean getConteinerizacao() {
        return this.conteinerizacao;
    }

    public void setConteinerizacao(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public BackEnd(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public BackEnd() {
    }

	@Override
	public String decreveLinguagem(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String descreveFramework(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}