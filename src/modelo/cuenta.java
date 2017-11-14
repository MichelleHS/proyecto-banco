package modelo;

public class cuenta {
	private int cueId;
	private int cueSaldo;
	private String cueFecApertura;
	private String cueEstado;
	private int cueSobregiro;
	private cliente clientote;

	public cuenta() {
	}

	public cuenta(int cueId, int cueSaldo, String cueFecApertura, String cueEstado, int cueSobregiro,
			cliente clientote) {
		this.cueId = cueId;
		this.cueSaldo = cueSaldo;
		this.cueFecApertura = cueFecApertura;
		this.cueEstado = cueEstado;
		this.cueSobregiro = cueSobregiro;
		this.clientote = clientote;
	}

	public int getCueId() {
		return cueId;	}
	public void setCueId(int cueId) {
		this.cueId = cueId;	}

	public int getCueSaldo() {
		return cueSaldo;	}
	public void setCueSaldo(int cueSaldo) {
		this.cueSaldo = cueSaldo;	}

	public String getCueFecApertura() {
		return cueFecApertura;	}
	public void setCueFecApertura(String cueFecApertura) {
		this.cueFecApertura = cueFecApertura;	}

	public String getCueEstado() {
		return cueEstado;	}
	public void setCueEstado(String cueEstado) {
		this.cueEstado = cueEstado;	}

	public int getCueSobregiro() {
		return cueSobregiro;	}
	public void setCueSobregiro(int cueSobregiro) {
		this.cueSobregiro = cueSobregiro;	}

	public cliente getClientote() {
		return clientote;	}
	public void setClientote(cliente clientote) {
		this.clientote = clientote;	}

	@Override
	public String toString() {
		return "cuenta [cueId=" + cueId 
				+ ", cueSaldo=" + cueSaldo 
				+ ", cueFecApertura=" + cueFecApertura
				+ ", cueEstado=" + cueEstado 
				+ ", cueSobregiro=" + cueSobregiro 
				+ ", clientote=" + clientote + "]";	}

}
