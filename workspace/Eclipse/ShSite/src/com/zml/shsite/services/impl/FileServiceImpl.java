package com.zml.shsite.services.impl;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import com.zml.shsite.components.FileComponentUtil;
import com.zml.shsite.services.IFileService;
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
		HEAD_PORTRAITS=String.format("%s/%s",servletContext.getContextPath(),HEAD_PORTRAITS);
		GOOD_IMAGES=String.format("%s/%s",servletContext.getContextPath(),GOOD_IMAGES);
	}
	@Override
	public boolean saveUserImage(MultipartFile file, int userId) {
		return fileComponentUtil.fileSave(HEAD_PORTRAITS, file,String.valueOf(userId));
	}

	@Override
	public boolean saveGoodImage(MultipartFile file, int goodId) {
		return fileComponentUtil.fileSave(GOOD_IMAGES, file,String.valueOf(goodId));
	}

	@Override
	public boolean saveOrUpdateUserImage(MultipartFile file, int userId) {
		return fileComponentUtil.fileSaveOrUpdate(HEAD_PORTRAITS, file,String.valueOf(userId));
	}

	@Override
	public boolean saveOrUpdateGoodImage(MultipartFile file,int goodId) {
		return fileComponentUtil.fileSaveOrUpdate(GOOD_IMAGES, file,String.valueOf(goodId));
	}

	@Override
	public boolean deleteUserImage(int userId) {
		return fileComponentUtil.fileDelete(String.format("%s/%s", HEAD_PORTRAITS,String.valueOf(userId)));
	}

	@Override
	public boolean deleteGoodImage(int goodId) {
		return fileComponentUtil.fileDelete(String.format("%s/%s",GOOD_IMAGES,String.valueOf(goodId)));
	}
}