package tranvanHay_CK;

import java.util.Date;

public class HoaDonGio extends HoaDon {
	private int soGio;
	
	public int getSoGio() {
		return soGio;
	}

	public void setSoGio(int soGio) throws Exception {
		if (soGio>=1) {
			this.soGio = soGio;
		} else {
			throw new Exception("Lỗi");
		}
	
	}

	public HoaDonGio(String maHD, String tenKH, String maPH, double donGia, Date ngayLHD, int soGio) throws Exception {
		super(maHD, tenKH, maPH, donGia, ngayLHD);
		if (maHD!=null) {
			this.soGio = soGio;
		}
		else {
			throw new Exception("Lỗi mã");
		}
	}

	public HoaDonGio() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double getThanhTien() {
		if (getSoGio()>30) {
			return 0;
		} else if (getSoGio()>=24) {
			return 24*getDonGia();
		} else {
			return getDonGia()*getSoGio();
		}
	}

	@Override
	public String toString() {
		return super.toString() + "HoaDonGio [soGio=" + soGio +  ", getThanhTien()=" + getThanhTien() + "]";
	}

	
	
}
