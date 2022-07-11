<%-- 
    Document   : DateFormat
    Created on : Jul 11, 2022, 8:10:43 AM
    Author     : fpt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="https://your.uri/jsp/tlds/format" prefix="format"%>

<a href="WEB-INF/tlds/DateFormatTag.tld"></a>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <format:formatNumber number="20221107" format="yyyyMMdd"/><br/>
        <format:formatNumber number="2022/11/07" format="yyyy/MM/dd"/><br/>
        <format:formatNumber number="2021-11-02" format="yyyy-MM-dd"/><br/>
        <format:formatNumber number="2002-01-05" format="yyyy-dd-MM"/><br/>
        <format:formatNumber number="2022/31/12" format="yyyy/dd/MM"/><br/>
    </body>
</html>
