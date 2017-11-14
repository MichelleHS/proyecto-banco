package modelo;

public class juridico extends cliente {
	private String jurRazonSocial;
	
	public juridico() {}
	
	public juridico(String jurRazonSocial) {
		this.jurRazonSocial = jurRazonSocial;
	}

	public juridico(String cliCategoria, ejecutivo eje, String jurRazonSocial) {
		this.jurRazonSocial = jurRazonSocial;	}
	
	public String getJurRazonSocial() {
		return jurRazonSocial;	} 
	public void setJurRazonSocial(String jurRazonSocial) {
		this.jurRazonSocial = jurRazonSocial;}

	@Override
	public String toString() {
		return "juridico [jurRazonSocial=" + jurRazonSocial 
				+ ", cliCategoria=" + cliCategoria 
				+ ", eje=" + eje
				+ ", perRut=" + perRut 
				+ ", perNombre=" + perNombre 
				+ ", perApePaterno=" + perApePaterno
				+ ", perApeMaterno=" + perApeMaterno 
				+ ", perNacionalidad=" + perNacionalidad 
				+ ", perFecNacimiento="+ perFecNacimiento + "]";
	}
	
	
	
	
	

}
