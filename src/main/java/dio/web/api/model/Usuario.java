package dio.web.api.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Integer id;
	private String login;
	private String password;
	private List<String> telefone;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario() {
		super();
	}

	public Usuario(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public List<String> getTelefone() {
		if(telefone == null) {
			telefone = new ArrayList<String>();
		}
		return telefone;
	}

	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", password=" + password + ", telefone=" + telefone + "]";
	}
	
}
