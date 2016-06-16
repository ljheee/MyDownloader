package com.ljheee.downloader.core;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFile {
	
	/**
	 * 从目标url  现在资源到dest
	 * @param url  目标资源--可以是文件、视频、文本....
	 * @param dest 指定下载后  封装的文件对象，指定保存文件名和路径
	 * @throws IOException
	 */
	public static void downloadFile(URL url, String dest) throws IOException {

		//下载方法(分装在commons-io-2.5.jar)一行搞定
		FileUtils.copyURLToFile(url, new File(dest));
		
	}
}
