<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${ not empty uploadMessage }">

	<div id="uploadMessageModel" class="modal">
		<div class="modal-dialog">
			<div class="modal-content">
			
				<div class="modal-header">
					<h5>File Upload Result</h5>
					<button class="btn-close" type="button" aria-label="Close" data-bs-dismiss="modal"></button>
				</div>
				
				<div class="modal-body">
					<p>${ uploadMessage }</p>
				</div>
				
				<div class="modal-footer">
					<button class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
				</div>
			
			</div>
		</div>
	</div>

</c:if>