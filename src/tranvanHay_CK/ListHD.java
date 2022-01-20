package tranvanHay_CK;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListHD {
	List<HoaDon> ls;

	public ListHD() {
		ls = new ArrayList<HoaDon>();
	}

	// them hoa don
	public boolean themHD(HoaDon hd) {
		if (ls.contains(hd)) {
			return false;
		} else {
			return ls.add(hd);
		}
	}

	public void xuatHD() {
		for (HoaDon h : ls) {
			if (h != null) {
				System.out.println(h);
			}
		}
	}
	public boolean xoaHD(String maHD) {
		for (HoaDon h : ls) {
			if (h.getMaHD().equalsIgnoreCase(maHD)) {
				return ls.remove(h);
		}
		}
		return false;
	}
	public boolean xoaHD1(String hd) {
		System.out.println("xoa ne");
		return ls.removeIf(p->p.getMaHD().contains(hd));
	}
	public void sapXep() {
		Collections.sort(ls, new Comparator<HoaDon>() {
			@Override
			public int compare(HoaDon o1, HoaDon o2) {
				String x= new String(o1.getMaHD());
				String y= new String(o2.getMaHD());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	public HoaDon timkiem(String maHD) {
		for (HoaDon h : ls) {
			if (h.getMaHD().equalsIgnoreCase(maHD)== true) {
				return h;
			}
		}
		return null;
	}

	public boolean capnhat (String maHD, double donGia) throws Exception {
		HoaDon h = timkiem(maHD);
		int viTri = -1;
		if (h != null) {
			if(h instanceof HoaDon) {
				((HoaDon)h).setDonGia(donGia);
				viTri = ls.indexOf(h);
				ls.set(viTri, h);
				return true;
			}
		}
		return false;
	}
	
	public void sapXepTangTheoMa() {
		 Collections.sort(ls, Comparator.comparing(HoaDon::getMaHD));
	 }
	public void locHD(int nam) {
		Calendar ngayLoc= Calendar.getInstance();
		for (HoaDon h : ls) {
			ngayLoc.setTime(h.getNgayLHD());
			ngayLoc.add(Calendar.MONTH,1);
			if (ngayLoc.get(Calendar.YEAR)==nam) {
				System.out.println(h);
			}
			}
			
		}
	}
