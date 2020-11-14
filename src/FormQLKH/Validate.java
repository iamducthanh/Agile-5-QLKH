package FormQLKH;

class Validate {
	public static boolean checkNull(String text) {
		if(text.isBlank()) {
			return false;
		} else return true;
	}
}
