# MyDownloader
A downloader tool  of Java
2016.6.16
Today I learned the FileUpload of Apache commons,which included commons-io-2.5.jar,a version of powered IO.

commons-io-2.5.jar 是java IO的增强版，功能很强大。
此版本下载器，主要是用了其封装好的方法
FileUtils.copyURLToFile(url, new File(dest));//把目标url资源下载  封装到File。