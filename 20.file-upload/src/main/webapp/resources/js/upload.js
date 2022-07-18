document.addEventListener('DOMContentLoaded', () => {
	
	// Fetch Event to Upload Button
	document.getElementById('uploadBtn').addEventListener('click', () => {
		document.getElementById('uploadInput').click();
	})
	
	
	// Submit Form when File-Input value changes
	document.getElementById('uploadInput').addEventListener('change', () => {
		document.getElementById('uploadForm').submit();
	})
	
	// show upload modal dialog
	var modalDialog = document.getElementById('uploadMessageModel');
	
	if(modalDialog){
		var modal = new bootstrap.Modal(modalDialog);
		modal.show();
	}
})