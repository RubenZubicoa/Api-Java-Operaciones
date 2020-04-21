package de.isri.es.Editor.models;

public class ComprobacionLogica {

	private int id;
	private int idOperacion;
	private int idModelo;
	private int idTipoComprobacion;
	private int equals;
	private int error;
	private String texto;
	private int codigoPuesto;
	
	private Operacion operacion;
	private Modelo modelo;
	private TipoComprobacion tipoComprobacion;
	private Puesto puesto;
	
	public ComprobacionLogica() {
		
	}
	
	public ComprobacionLogica(int id, int idOperacion, int idModelo, int idTipoComprobacion, int equals, int error,
			String texto, int codigoPuesto, Operacion operacion, Modelo modelo, TipoComprobacion tipoComprobacion, Puesto puesto) {
		super();
		this.id = id;
		this.idOperacion = idOperacion;
		this.idModelo = idModelo;
		this.idTipoComprobacion = idTipoComprobacion;
		this.equals = equals;
		this.error = error;
		this.texto = texto;
		this.codigoPuesto = codigoPuesto;
		this.operacion = operacion;
		this.modelo = modelo;
		this.tipoComprobacion = tipoComprobacion;
		this.puesto = puesto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public int getIdTipoComprobacion() {
		return idTipoComprobacion;
	}

	public void setIdTipoComprobacion(int idTipoComprobacion) {
		this.idTipoComprobacion = idTipoComprobacion;
	}

	public int getEquals() {
		return equals;
	}

	public void setEquals(int equals) {
		this.equals = equals;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public TipoComprobacion getTipoComprobacion() {
		return tipoComprobacion;
	}

	public void setTipoComprobacion(TipoComprobacion tipoComprobacion) {
		this.tipoComprobacion = tipoComprobacion;
	}

	public int getCodigoPuesto() {
		return codigoPuesto;
	}

	public void setCodigoPuesto(int codigoPuesto) {
		this.codigoPuesto = codigoPuesto;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	
	
	
}
