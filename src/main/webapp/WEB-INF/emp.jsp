<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门列表</title>
</head>
<body>
	<div id="data">            
                    <table id="datalist">
                        <tr>
                            <th>员工编号</th>
                            <th class="width100">员工姓名</th>
                            <th>员工所在部门号</th>
                            <th>员工所在部门</th>
                            <th>职位</th>
                            <th>薪资</th>
                            <th class="width200"></th>
                        </tr>
                        <c:forEach items="${list}" var="l">   
                                           
                        <tr>
                            <td>${l.empId}</td>
                            <td>${l.empno}</td>
                            <td><a href="fee_detail.html">${l.ename}</a></td>
                            <td>${l.depno}</td>
                            <td>${l.depname}</td>
                            <td>${l.job}</td>
                            <td>${l.sal}</td>
                            <td>                                
                                <input type="button" value="修改" class="btn_modify" onclick="location.href='fee_modi.html';" />
                                <input type="button" value="删除" class="btn_delete" onclick="deleteFee();" />
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
</body>
</html>