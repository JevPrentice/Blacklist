console.log("blacklist.js start");

$(function() {

	loadAndActivateHomePage();

	// Activate nav bar buttons
	$(".btnHome").click(function() {
		loadAndActivateHomePage();
	});

	$(".btnContact").click(function() {
		loadAndActivateContactPage();
	});

	$(".btnDoctorRegistration").click(function() {
		$("#content").load("ajax/doctorRegistrationForm.html");
	});

	$(".btnPatientRegistration").click(function() {
		$("#content").load("ajax/patientRegistrationForm.html");
	});

	$(".btnLostAccount").click(function() {
		$("#content").load("ajax/lostAccount.html");
	});

	$(".btnLogin").click(function() {
		// alert("You clicked on login");

		var request = $.ajax({
			type : "GET",
			url : "http://localhost/Blacklist/php/main.php/qwe",
		});

		request.done(function(data) {
			if (console && console.log) {
				console.log("Sample of data:", data.slice(0, 100));
			}
			
			
			
		});

		request.fail(function(jqXHR, textStatus) {
			alert("Request failed: " + textStatus);
		});

	});

});

function loadAndActivateHomePage() {
	$("#content").load("ajax/home.html", function() {

		$(".btnPatientRegistration").click(function() {
			$("#content").load("ajax/patientRegistrationForm.html");
		});

		$(".btnDoctorRegistration").click(function() {
			$("#content").load("ajax/doctorRegistrationForm.html");
		});

	});
}

function loadAndActivateContactPage() {
	$("#content").load("ajax/contact.html", function() {

	});
}

console.log("blacklist.js finished");
