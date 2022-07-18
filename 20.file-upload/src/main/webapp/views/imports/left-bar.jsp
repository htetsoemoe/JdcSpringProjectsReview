<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="card">
	<div class="card-header">Book Search</div>
	
	<c:url value="/book" var="searchUrl"></c:url>
	<form action="${searchUrl}" class="card-body">
	
		<div class="mb-4">
			<label class="col-form-label" for="category">Category</label>
			<select name="category" id="category" class="form-select">
				<option value="">Select Category</option>
				<c:forEach var="c" items="${categories}">
					<c:choose>
						<c:when test="${ c.id eq param.category }">
							<option value="${c.id}" selected="selected">${c.name}</option>
						</c:when>
						
						<c:otherwise>
							<option value="${ c.id }">${ c.name }</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select>			
		</div>
		
		<div class="mb-4">
			<label for="keyword" class="col-form-label">Keyword</label>	
			<input type="text" name="keyword" value="${ param.keyword }" id="keyword" class="form-control" placeholder="Enter Keyword" />
		</div>
		
		
		<c:url value="/book/edit" var="editUrl"></c:url>

		<div class="d-grid gap-2">
			<button class="btn btn-secondary">Search</button> <!-- This button acts like submit button -->
			<a href="#" id="uploadBtn" class="btn btn-primary">Upload</a>
			<a href="${editUrl}" class="btn btn-danger">Add New</a>
		</div>
	</form>
	
	<c:url value="/upload" var="upload"></c:url>
	<form action="${ upload }" method="post" id="uploadForm" class="d-none" enctype="multipart/form-data">
		<input type="file" name="uploadFile" id="uploadInput" />
	</form>
	
	<c:url value="/resources/js/upload.js" var="uploadJs"></c:url>
	<script src="${ uploadJs }"></script>

</div>
