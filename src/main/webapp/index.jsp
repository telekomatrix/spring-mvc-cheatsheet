<!DOCTYPE html>
<html>
	<head>
		<!-- jQuery from CDN -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
	</head>
	<body>
		<script type="text/javascript">
$.post("commands/user/save", {id: "xxx", firstName: 'John', lastName: 'Doe'}, null, 'json')
.done(function() {
	
	$.get("commands/user/get/xxx")
	.done(function(user) {
		$(document.body).text(JSON.stringify(user));
	});
	
});
		
		
		</script>	
	</body>
</html>