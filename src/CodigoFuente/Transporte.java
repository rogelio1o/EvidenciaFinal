package CodigoFuente;

import java.util.Timer;

public class Transporte {
public String envio;
public String entrega;
public Timer tiempo;
public String tipo_transporte;
public double cap_de_carga;
public String direccion_envio;
public String getEnvio() {
	return envio;
}
public void setEnvio(String envio) {
	this.envio = envio;
}
public String getEntrega() {
	return entrega;
}
public void setEntrega(String entrega) {
	this.entrega = entrega;
}
public Timer getTiempo() {
	return tiempo;
}
public void setTiempo(Timer tiempo) {
	this.tiempo = tiempo;
}
public String getTipo_transporte() {
	return tipo_transporte;
}
public void setTipo_transporte(String tipo_transporte) {
	this.tipo_transporte = tipo_transporte;
}
public double getCap_de_carga() {
	return cap_de_carga;
}
public void setCap_de_carga(double cap_de_carga) {
	this.cap_de_carga = cap_de_carga;
}
public void setdireccion_envio(String direccion_envio) {
	this.direccion_envio = direccion_envio;
}


}