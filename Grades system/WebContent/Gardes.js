function ShowAddStudent() {
    document.getElementById("form").style.visibility = "visible";
}

function hideAddStudent() {
    document.getElementById("fName").value = "";
    document.getElementById("lName").value = "";
    document.getElementById("id").value = "";
    document.getElementById("grade").value = "";
    document.getElementById("form").style.visibility = "hidden";
}

const app = {
		events : [],
		baseURL : 'rest/api/event'
	};

	function showAllEvents() {
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				alert("All motim: " + this.responseText);
				app.events = JSON.parse(this.responseText);
				
			}
		};
		xhttp.open("GET", app.baseURL + "/all", true);
		xhttp.send();
	}

	function showAllEventsb() {
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				alert("All motim: " + this.responseText);
				app.events = JSON.parse(this.responseText);
				
			}
		};
		xhttp.open("GET", app.baseURL + "/all", true);
		xhttp.send();
	}

	