package modelo;

public class natural extends cliente {
	private int natPatrimonio;

	public natural() {	}

	public natural(String cliCategoria, ejecutivo eje, int natPatrimonio) {
		this.natPatrimonio = natPatrimonio;	}

	public int getNatPatrimonio() {
		return natPatrimonio;	}
	public void setNatPatrimonio(int natPatrimonio) {
		this.natPatrimonio = natPatrimonio;	}

	@Override
	public String toString() {
		return "natural [natPatrimonio=" + natPatrimonio 
				+ ", cliCategoria=" + cliCategoria 
				+ ", eje=" + eje
				+ ", perRut=" + perRut 
				+ ", perNombre=" + perNombre 
				+ ", perApePaterno=" + perApePaterno
				+ ", perApeMaterno=" + perApeMaterno 
				+ ", perNacionalidad=" + perNacionalidad 
				+ ", perFecNacimiento="	+ perFecNacimiento + "]";}
	
}
