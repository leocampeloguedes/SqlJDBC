package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void iniBanco() {
		UserPosDAO userPosDao = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(7L);
		userposjava.setNome("Maria Ribeiro");
		userposjava.setEmail("maria@mail.com");
		
		
		userPosDao.salvar(userposjava);
		
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("------------------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initBuscar() {
		
		UserPosDAO dao = new UserPosDAO();
		
		try {
			Userposjava userposjava = dao.buscar(6L);
			
			System.out.println(userposjava);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void initAtualizar() {
		try {
			UserPosDAO dao = new UserPosDAO();
			Userposjava objetoBanco = dao.buscar(5L);
			objetoBanco.setNome("Nome mudado com metodo atualizar");
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
