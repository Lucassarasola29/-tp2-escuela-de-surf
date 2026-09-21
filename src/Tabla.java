public class Tabla {
	private String codigo;
	private double largoEnPies;
	private boolean disponible;

	public Tabla(String codigo, double largoEnPies) {
		this.codigo = codigo;
		this.setLargoEnPies(largoEnPies);
		this.disponible = true;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public double getLargoEnPies() {
		return this.largoEnPies;
	}

	public void setLargoEnPies(double largoEnPies) {
		if (largoEnPies < 5.00 || largoEnPies > 10.00) {
			System.out.println("Largo en pies invalido, rango correcto ( >= 5.00 | <= 10.00)");
		} else {
			this.largoEnPies = largoEnPies;
		}
	}

	public boolean disponible() {
		return this.disponible;
	}

	public void setDisponibilidad(boolean disponible) {
		this.disponible = disponible;
	}

	public String descripcion() {
		if (this.disponible()) {
			return "Tabla: " + this.codigo + " Largo: " + largoEnPies + "Estado: disponible";
		} else {
			return "Tabla: " + this.codigo + " Largo: " + largoEnPies + "Estado: no disponible";
		}
	}
}
