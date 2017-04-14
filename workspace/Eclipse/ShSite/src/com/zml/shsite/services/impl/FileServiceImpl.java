package com.zml.shsite.services.impl;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zml.shsite.components.FileComponentUtil;
import com.zml.shsite.services.IFileService;
/**
 * 文件服务
 * 内含头像和商品图片的文件的上传、修改、删除逻辑
 * @author zml
 *
 */
@Service
public class FileServiceImpl implements IFileService {
	private static String HEAD_PORTRAITS="headportraits";
	private static String GOOD_IMAGES="goodimages";
	@Autowired
	private FileComponentUtil fileComponentUtil=null;	
	private ServletContext servletContext=null;
	@Autowired
	public void setServletContext(ServletContext servletContext){
		this.servletContext=servletContext;
		String path=servletContext.getRealPath("ss");
		HEAD_PORTRAITS=servletContext.getRealPath(HEAD_PORTRAITS);
		GOOD_IMAGES=servletContext.getRealPath(GOOD_IMAGES);
	}
	@Override
	public boolean saveUserImage(MultipartFile file, int userId) {
		return fileComponentUtil.fileSave(HEAD_PORTRAITS, file,String.valueOf(userId)+".jpg");
	}

	@Override
	public boolean saveGoodImage(MultipartFile file, int goodId) {
		return fileComponentUtil.fileSave(GOOD_IMAGES, file,String.valueOf(goodId)+".jpg");
	}

	@Override
	public boolean saveOrUpdateUserImage(MultipartFile file, int userId) {
		return fileComponentUtil.fileSaveOrUpdate(HEAD_PORTRAITS, file,String.valueOf(userId)+".jpg");
	}

	@Override
	public boolean saveOrUpdateGoodImage(MultipartFile file,int goodId) {
		return fileComponentUtil.fileSaveOrUpdate(GOOD_IMAGES, file,String.valueOf(goodId)+".jpg");
	}

	@Override
	public boolean deleteUserImage(int userId) {
		return fileComponentUtil.fileDelete(String.format("%s/%s.jpg", HEAD_PORTRAITS,String.valueOf(userId)));
	}

	@Override
	public boolean deleteGoodImage(int goodId) {
		return fileComponentUtil.fileDelete(String.format("%s/%s.jpg",GOOD_IMAGES,String.valueOf(goodId)));
	}
}
