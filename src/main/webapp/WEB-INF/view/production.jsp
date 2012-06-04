<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html> 

<head><title>添加产品</title> </head> 

<body> 

	<form:form action="addProduction.do" commandName="production">
		<table>
	        <tr>
	            <td>产品ID</td>
	            <td><input type="text" name="productionid"/></td>
	        </tr>
	        <tr>
	            <td>产品名称</td>
	            <td><input type="text" name="productionname" /></td>
	        </tr>
	        <tr>
	            <td>产品价格</td>
	            <td><input type="text" name="price" /></td>
	        </tr>
	        <tr>
	            <td>产品规格</td>
	            <td><input type="text" name="detail" /></td>
	        </tr>
	        <tr>
	            <td colspan="3">
	                <input type="submit" value="ADD A RECORD" />
	            </td>
	        </tr>
	    </table>	
	</form:form>
</body> 

</html> 
