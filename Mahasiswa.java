
public class Mahasiswa extends Elemen{
	private int angkatan;
	private int nilai;
	private boolean adaNilai;
	private boolean nilaiMasuk;
	
	public boolean isAdaNilai() {
		return adaNilai;
	}

	public void setAdaNilai(boolean adaNilai) {
		this.adaNilai = adaNilai;
	}

	public boolean isNilaiMasuk() {
		return nilaiMasuk;
	}

	public void setNilaiMasuk(boolean nilaiMasuk) {
		this.nilaiMasuk = nilaiMasuk;
	}

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public Mahasiswa(String nama, String gender, int umur, int angkatan) {
		super(nama, gender, umur);
		this.angkatan = angkatan;
	}

	public int getAngkatan() {
		return angkatan;
	}

	public void setAngkatan(int angkatan) {
		this.angkatan = angkatan;
	}
}
