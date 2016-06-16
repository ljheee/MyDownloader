package com.ljheee.downloader.core;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFile {
	
	/**
	 * ��Ŀ��url  ������Դ��dest
	 * @param url  Ŀ����Դ--�������ļ�����Ƶ���ı�....
	 * @param dest ָ�����غ�  ��װ���ļ�����ָ�������ļ�����·��
	 * @throws IOException
	 */
	public static void downloadFile(URL url, String dest) throws IOException {

		//���ط���(��װ��commons-io-2.5.jar)һ�и㶨
		FileUtils.copyURLToFile(url, new File(dest));
		
	}
}
