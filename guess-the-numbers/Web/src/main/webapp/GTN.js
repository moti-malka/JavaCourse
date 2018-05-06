var _userName;
var _pass;

function LogIn(){
    var modal = document.getElementById('id01');
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target === modal) 
            modal.style.display = "none";
    };
}

function signInBtn(){
    _userName =  document.getElementById("userName").value;
    _pass = document.getElementById("pass").value;
}


