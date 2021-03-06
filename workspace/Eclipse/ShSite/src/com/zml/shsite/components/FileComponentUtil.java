package com.zml.shsite.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
/**
 * 文件保存组件
 * @author zml
 *
 */
@Component
public class FileComponentUtil{
    /**
     * 保存或者更新文件
     * @param desDir
     * @param file
     * @param filename
     * @return
     */
	public boolean fileSaveOrUpdate(String desDir, MultipartFile file, String filename) {
		String fullFileName=String.format("%s\\%s",desDir,filename);
		try {
			fileDelete(fullFileName);
			saveFileFromInputStream(file.getInputStream(),fullFileName);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	/**
	 * 保存文件
	 * @param desDir
	 * @param file
	 * @param filename
	 * @return
	 */
	public boolean fileSave(String desDir, MultipartFile file, String filename) {
		try {
			saveFileFromInputStream(file.getInputStream(),String.format("%s\\%s",desDir,filename));
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	/**
	 * 删除文件
	 * @param fileName
	 * @return
	 */
	public boolean fileDelete(String fileName) {
		File file = new File(fileName);
		if (file.exists() && file.isFile()) {
			if (file.delete()) {
				return true;
			}
		}
		return false;
	}
	/**
	 *从输入流中保存文件
	 * @param stream
	 * @param fullFileName
	 * @throws IOException
	 */
	private void saveFileFromInputStream(InputStream stream, String fullFileName) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(fullFileName);
		int byteCount = 0;
		byte[] bytes = new byte[2048];
		while ((byteCount = stream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, byteCount);
		}
		outputStream.close();
		stream.close();
	}
}
