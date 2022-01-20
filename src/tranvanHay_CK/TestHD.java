package tranvanHay_CK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestHD {
	public static void main(String[] args) throws Exception {
		String ngay1="20/10/2021";
		String ngay2="21/11/2000";
		String ngay3="22/12/2021";
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		Date d1, d2,d3;
		d1=df.parse(ngay1);
		HoaDon h1= new HoaDonGio("1234567", "Truong Anh", "P4", 300000, d1, 5);
		d2=df.parse(ngay2);
		HoaDon h2= new HoaDonGio("87654321", "Truong Anh", "P4", 300000, d2, 5);
		d3=df.parse(ngay3);
		HoaDon h3= new HoaDonGio("12387654", "Truong Anh", "P4", 300000, d3, 5);
		ListHD ls= new ListHD();
		ls.themHD(h1);
		ls.themHD(h2);
		ls.themHD(h3);
		System.out.println("Danh sach hoa don");
		ls.xuatHD();
		System.out.println("Tim hoa don theo nam");
		ls.locHD(2000);
		System.out.println("Xoa theo mã:");
		ls.xoaHD1("1234567");
		ls.xuatHD();
		ls.capnhat("87654321", 99999);
		ls.xuatHD();
		System.out.println("Sap xep moi");
		ls.sapXepTangTheoMa();
		ls.xuatHD();
		
	}

}
