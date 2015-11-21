package net.anaksibolga.util;

import java.io.IOException;

import com.lowagie.text.pdf.PdfReader;

public class PDFDecryptor {

	public static void main(String[] args) throws IOException {

		for (int j = 3; j < 10; j++) {
			final int k = j;
			new Thread() {
				public void run() {
					for (int i = 0; i < 100000; i++) {
						String s = String.format("%06d", k * 100000 + i);
						try {
							PdfReader reader = new PdfReader("./data/A.PDF", s.getBytes());
							System.out.println(s + " OK");
							reader.close();
						} catch (Exception e) {
							// System.out.println(s);
						}
					}
				}
			}.start();
		}
	}
}
