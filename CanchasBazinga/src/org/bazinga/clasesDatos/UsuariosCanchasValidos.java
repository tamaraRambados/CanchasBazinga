package org.bazinga.clasesDatos;

public class UsuariosCanchasValidos {
	
	private Integer nroUsuario;
	private String usuarioAdmin;
	private String usuarioContrasenia;
	
	public Integer getNroUsuario() {
		return nroUsuario;
	}
	public void setNroUsuario(Integer nroUsuario) {
		this.nroUsuario = nroUsuario;
	}
	public String getUsuarioAdmin() {
		return usuarioAdmin;
	}
	public void setUsuarioAdmin(String usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}
	public String getUsuarioContrasenia() {
		return usuarioContrasenia;
	}
	public void setUsuarioContrasenia(String usuarioContrasenia) {
		this.usuarioContrasenia = usuarioContrasenia;
	}
	
	public UsuariosCanchasValidos(Integer nroUsuario, String usuarioAdmin,
			                      String usuarioContrasenia) {
		super();
		this.nroUsuario = nroUsuario;
		this.usuarioAdmin = usuarioAdmin;
		this.usuarioContrasenia = usuarioContrasenia;
	}
	
	
	

}
