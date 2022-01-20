package tranvanHay_CK;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HoaDon {
	protected String maHD, tenKH, maPH;
	protected double donGia;
	protected Date ngayLHD;
	// Dong gói

	public abstract double getThanhTien();// phuong thuc ao

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) throws Exception {
		if (maHD != null) {
			this.maHD = maHD;
		} else {
			throw new Exception("Lỗi mã");
		}

	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) throws Exception {
		if (tenKH!=null) {
			this.tenKH = tenKH;
		} else {
			throw new Exception("Lỗi");
		}
	
	}

	public String getMaPH() {
		return maPH;
	}

	public void setMaPH(String maPH) {
		this.maPH = maPH;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) throws Exception {
		if (donGia>0) {
			this.donGia = donGia;
		} else {
			throw new Exception("Lỗi");
		}
		
	}

	public Date getNgayLHD() {
		return ngayLHD;
	}

	public void setNgayLHD(Date ngayLHD) {
		this.ngayLHD = ngayLHD;
	}
	// tạo constructor

	public HoaDon(String maHD, String tenKH, String maPH, double donGia, Date ngayLHD) throws Exception {
		super();
		if (maHD != null) {
			this.maHD = maHD;
		} else
			throw new Exception("Lỗi mã");

		this.tenKH = tenKH;
		this.maPH = maPH;
		this.donGia = donGia;
		this.ngayLHD = ngayLHD;
	}

	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHD == null) ? 0 : maHD.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		if (maHD == null) {
			if (other.maHD != null)
				return false;
		} else if (!maHD.equals(other.maHD))
			return false;
		return true;
	}

	// toString
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return "HoaDon [maHD=" + maHD + ", tenKH=" + tenKH + ", maPH=" + maPH + ", donGia=" + donGia + ", ngayLHD="
				+ df.format(ngayLHD.getTime()) + "]";
	}

}
