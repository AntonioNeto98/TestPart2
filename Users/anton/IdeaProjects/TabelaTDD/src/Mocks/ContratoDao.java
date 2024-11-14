package Mocks;

public class ContratoDao implements IContratoDao {

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

	@Override
	public String buscar() {
		throw new UnsupportedOperationException("Busca não encontrada");
	}

	@Override
	public String atualizar() {
		throw new UnsupportedOperationException("Atualização mau sucedida");		
	}

	@Override
	public String excluir() {
		throw new UnsupportedOperationException("Impossivel excluir");
	}

}
