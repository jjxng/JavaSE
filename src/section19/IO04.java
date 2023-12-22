package section19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class IO04 {

	public static void main(String[] args) {

		String fileUrl = "https://webzine.glovis.net/old_post_data/images/vol150/img/s0302_img01.jpg";
		String savePath = "./upload/image1.jpg";
		
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			URL url = new URL(fileUrl);
			
			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream(savePath);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while ((readByteCnt = bis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("File Download Down!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
				if (bis != null) bis.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}

}
