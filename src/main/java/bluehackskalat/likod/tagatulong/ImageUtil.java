package bluehackskalat.likod.tagatulong;

public class ImageUtil {
	public static String concatPathToFileName(String filename) {
		return System.getProperty("user.dir") + "\\src\\main\\resources\\" + filename;
	}
}
