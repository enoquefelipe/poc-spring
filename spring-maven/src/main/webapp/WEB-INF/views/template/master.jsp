<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!doctype html>
<html lang="pt-BR" id="ng-app" ng-app="">
<head>
<title><spring:message code="project.title" /></title>
<link href="<c:url value='/resources/css/bootstrap.min.css' />" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<tiles:insertAttribute name="header" />

		<tiles:insertAttribute name="body" />
	</div>

	<!--[if !IE]><!-->
	<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
	<!--<![endif]-->

	<tiles:insertAttribute name="footer" />
</body>
</html>