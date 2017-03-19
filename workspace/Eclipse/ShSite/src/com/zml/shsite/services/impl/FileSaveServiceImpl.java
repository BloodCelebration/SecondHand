package com.zml.shsite.services.impl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileSaveServiceImpl implements IFileSaveService {

	@Override
	public boolean fileSave(String destinationDir, MultipartFile file, String filename) {
		try {
			SaveFileFromInputStream(file.getInputStream(), destinationDir, filename);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	private void SaveFileFromInputStream(InputStream stream, String path, String filename) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(path + "/" + filename);
		int byteCount = 0;
		byte[] bytes = new byte[2048];
		while ((byteCount = stream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, byteCount);
		}
		outputStream.close();
		stream.close();
	}
}
