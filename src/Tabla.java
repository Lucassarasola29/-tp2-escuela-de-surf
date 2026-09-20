public class Tabla {
	private int codigo;
	private double largoEnPies;
	private boolean disponible;

	public Tabla(int codigo, double largoEnPies) {
		this.codigo = codigo;
		this.largoEnPies = largoEnPies;
		this.disponible = true;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public double getLargoEnPies() {
		return this.largoEnPies;
	}

	public boolean disponible() {
		return this.disponible;
	}

	public void setDisponibilidad(boolean disponible) {
		this.disponible = disponible;
	}
}
