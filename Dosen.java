
public class Dosen extends Staf1 {
	private String matkul;

	public Dosen(String nama, String gender, int umur, String pekerjaan, String matkul) {
		super(nama, gender, umur, pekerjaan);
		this.matkul = matkul;
	}
	public String getMatkul() {
		return matkul;
	}

	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}

	
}
