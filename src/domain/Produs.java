package domain;

public class Produs {
	private int id;
	private String denumire;
	private String descriere;
	private String calePoza;

	@Override
	public String toString() {
		return "Produs [id=" + id + ", denumire=" + denumire + ", descriere=" + descriere + ", calePoza=" + calePoza
				+ "]";
	}

	public Produs(int id, String denumire, String descriere, String calePoza) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.descriere = descriere;
		this.calePoza = calePoza;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public String getCalePoza() {
		return calePoza;
	}

	public void setCalePoza(String calePoza) {
		this.calePoza = calePoza;
	}

}
