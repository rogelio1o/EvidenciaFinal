package CodigoFuente;

public class Aereo1 extends Transporte {
	public String costo_envio;
	public String velocidad_entrega;
	public String numero_serie;
	public String getCosto_envio() {
		return costo_envio;
	}
	public void setCosto_envio(String costo_envio) {
		this.costo_envio = costo_envio;
	}
	public String getVelocidad_entrega() {
		return velocidad_entrega;
	}
	public void setVelocidad_entrega(String velocidad_entrega) {
		this.velocidad_entrega = velocidad_entrega;
	}
	public String getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}

}
