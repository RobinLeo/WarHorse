<%@ page contentType="text/html;charset=GBK" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html> 

<head><title>��Ӳ�Ʒ</title> </head> 

<body> 

	<form:form action="addProduction.do" commandName="production">
		<table>
	        <tr>
	            <td>��ƷID</td>
	            <td><input type="text" name="productionid"/></td>
	        </tr>
	        <tr>
	            <td>��Ʒ����</td>
	            <td><input type="text" name="productionname" /></td>
	        </tr>
	        <tr>
	            <td>��Ʒ�۸�</td>
	            <td><input type="text" name="price" /></td>
	        </tr>
	        <tr>
	            <td>��Ʒ���</td>
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
