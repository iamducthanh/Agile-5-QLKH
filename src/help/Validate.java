package help;

import form.QLKH;

public class Validate {
	static boolean check = true;
	public static boolean checkNull(String text) {
		if(text.isBlank()) {
			return false;
		} else return true;
	}
	
	public static String checkMa(String maSP) {
		if(maSP.isBlank()) {
			return "Bạn không được để trống mã sản phẩm!\n";
		} else {
			QLKH.list.forEach((SP) -> {
				if(SP.getMasp().equalsIgnoreCase(maSP)) {
					check = false;
				}
			});	
			if(check == false) {
				return "Mã sản phẩm này đã tồn tại!\n";
			} else {
				return "";
			}
		}
		 
	}
	
	public static String checkTen(String tenSP) {
		if(tenSP.isBlank()) {
			return "Bạn không được để trống tên sản phẩm!\n";
		} else {
			return "";
		}
	}
	
	public static String checkGia(String gia) {
		if(gia.isBlank()) {
			return "Bạn không được để trống giá!\n";
		} else {
			try {
				if(Double.parseDouble(gia) < 0) {
					return "Giá phải lớn hơn không!\n";
				} else return "";
			} catch (Exception e) {
				return "Giá phải là số!\n";
			}
		}
	}
	
	public static String checkSL(String soLuong) {
		if(soLuong.isBlank()) {
			return "Bạn không được để trống số lượng!\n";
		} else {
			try {
				if(Double.parseDouble(soLuong) < 0) {
					return "Số lượng phải lớn hơn không!\n";
				} else return "";
			} catch (Exception e) {
				return "Số lượng phải là số!\n";
			}
		}
	}
	
	public static String checkHSD(String hsd) {
		String reDa = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
		if(hsd.isBlank()) {
			return "Bạn không được để trống hạn sử dụng!\n";
		} else {
			if(!hsd.matches(reDa)) {
				return "Nhập sai định dạng yyyy-mm-dd!\n";
			} else {
				return "";
			}
		}
	}
	
}
