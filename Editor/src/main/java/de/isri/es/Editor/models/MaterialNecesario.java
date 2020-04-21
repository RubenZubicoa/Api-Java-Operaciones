package de.isri.es.Editor.models;

public class MaterialNecesario {

	private int idOperacion;
	private int idMaterial;
	private int cantidad;	
	private Operacion operacion;
	private Material material;
	
	
	
	public MaterialNecesario() {
		super();
	}

	


	public MaterialNecesario(int idOperacion, int idMaterial, int cantidad, Material material) {
		super();
		this.idOperacion = idOperacion;
		this.idMaterial = idMaterial;
		this.cantidad = cantidad;
		this.material = material;
	}




	public MaterialNecesario(int idOperacion, int idMaterial, int cantidad, Operacion operacion, Material material) {
		super();
		this.idOperacion = idOperacion;
		this.idMaterial = idMaterial;
		this.cantidad = cantidad;
		this.operacion = operacion;
		this.material = material;
	}



	public int getIdOperacion() {
		return idOperacion;
	}



	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}



	public int getIdMaterial() {
		return idMaterial;
	}



	public void setIdMaterial(int idMaterial) {
		this.idMaterial = idMaterial;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public Operacion getOperacion() {
		return operacion;
	}



	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}



	public Material getMaterial() {
		return material;
	}



	public void setMaterial(Material material) {
		this.material = material;
	}
	
	

	
	
	
	
	
}
