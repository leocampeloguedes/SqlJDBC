package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void iniBanco() {
		UserPosDAO userPosDao = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("João Ricardo");
		userposjava.setEmail("ricardo@mail.com");
		
		
		userPosDao.salvar(userposjava);
		
		
	}

}
