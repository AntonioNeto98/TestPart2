package Test;

import Mocks.IContratoDao;
import Mocks.ContratoDao;
import Mocks.ContratoDaoMock;
import Service.IContratoService;
import Service.ContratoService;

import org.junit.Test;
import org.junit.Assert;


public class ContractServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected =  UnsupportedOperationException.class)
    public void espearadoErroNaSalvarComBancoTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Não funciona com o banco", retorno);
    }
    
    @Test
   public void buscarTest() {
    	IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Buscando", retorno);
	   
   }
    
    @Test(expected =  UnsupportedOperationException.class)
    public void espearadoErroNoBuscarComBancoTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Busca não encontrada", retorno);
        }

    @Test
    public void atualizarTest() {
     	IContratoDao dao = new ContratoDaoMock();
         IContratoService service = new ContratoService(dao);
         String retorno = service.atualizar();
         Assert.assertEquals("Atualizando", retorno);
 	   
    }
     
     @Test(expected =  UnsupportedOperationException.class)
     public void espearadoErroNaAtualizacaoComBancoTest() {
         IContratoDao dao = new ContratoDao();
         IContratoService service = new ContratoService(dao);
         String retorno = service.atualizar();
         Assert.assertEquals("Atualização mau sucedida", retorno);
         }
     
     @Test
     public void excluirTest() {
      	IContratoDao dao = new ContratoDaoMock();
          IContratoService service = new ContratoService(dao);
          String retorno = service.excluir();
          Assert.assertEquals("Excluir", retorno);
     }
      
      @Test(expected =  UnsupportedOperationException.class)
      public void espearadoErroNaExclusaoComBancoTest() {
          IContratoDao dao = new ContratoDao();
          IContratoService service = new ContratoService(dao);
          String retorno = service.excluir();
          Assert.assertEquals("Impossivel excluir", retorno);
          }
}
