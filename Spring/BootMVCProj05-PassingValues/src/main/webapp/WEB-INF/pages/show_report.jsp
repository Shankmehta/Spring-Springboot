
<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<c:if test="${!empty empInfo}">
<b>emp Information :: ${empInfo.eno},${empInfo.ename},${empInfo.salary},${empInfo.vaccinated}</b>
</c:if>