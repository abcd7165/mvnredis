<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>pictureUploading</title>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8 ">
    </head>
    <body>
        <!-- <form enctype="multipart/form-data" method="post" action="/upload"> -->
        <form action="user/upload" method="post">
            文件：<input type="file" name="fileUpload"/>
            <input type="submit" value="上传"/>
        </form>
    </body>
</html>