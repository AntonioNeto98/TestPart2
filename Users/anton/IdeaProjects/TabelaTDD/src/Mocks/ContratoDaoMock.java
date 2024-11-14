package Mocks;

public class ContratoDaoMock implements IContratoDao {

	@Override
	public String salvar() {
		return "Sucesso";
		}
	
	@Override
	public String buscar() {
		return "Buscando";
		}
	
	@Override
	public String atualizar() {
		return "Atualizando";
		}
	
	@Override
	public String excluir() {
		return "Excluir";
		}

}
