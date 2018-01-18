/*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/* 
    Created on : Jan 13, 2018, 9:44:04 PM
    Author     : Motim
*/
var XO = "X";
var ind = 1;
var XWinners =0;
var OWinners =0;
 

function insertXO(td){
    if (td.innerHTML === "X" ||td.innerHTML === "O")
    {
        return ;
    }
    else{
        
    if(ind === 1){
        XO = "X";
        ind--;
    }
    else{
        XO = "O";
        ind++;
    }
    td.innerHTML = XO;
    CheckWinner();
    }
    
}

function CheckWinner(){
    
    var one  = document.getElementById ("1").textContent;
    var tow  = document.getElementById ("2").textContent;
    var tree  = document.getElementById ("3").textContent;
    var fore  = document.getElementById ("4").textContent;
    var five  = document.getElementById ("5").textContent;
    var six  = document.getElementById ("6").textContent;
    var seven  = document.getElementById ("7").textContent;
    var eight  = document.getElementById ("8").textContent;
    var nine  = document.getElementById ("9").textContent;
    
    if (one === XO && tow === XO && tree === XO){
        afterCheckWinner("1", "2", "3");
    }
    else if (fore === XO && five === XO && six === XO){
        afterCheckWinner("4", "5", "6");
    }
    else if (seven === XO && eight === XO && nine === XO){
        afterCheckWinner("7", "8", "9");
    }
    else if (one === XO && fore === XO && seven === XO){
        afterCheckWinner("1", "4", "7");
    }
    else if (tow === XO && five === XO && eight === XO){
        afterCheckWinner("2", "5", "8");
    }
    else if (tree === XO && six === XO && nine === XO){
        afterCheckWinner("3", "6", "9");
    }
    else if (tree === XO && five === XO && seven === XO){
        afterCheckWinner("3", "5", "7");
    }
    else if (one === XO && five === XO && nine === XO){
        afterCheckWinner("1", "5", "9");
    }
    
}

function afterCheckWinner(TDone, TDtow, TDtree){
    
    document.getElementById(TDone).style.background = "green";
    document.getElementById(TDtow).style.background = "green";
    document.getElementById(TDtree).style.background = "green";
    document.getElementById("theWinner").innerHTML = XO;
    if(XO === "X"){
        XWinners++;
        document.getElementById("scoreX").innerHTML = XWinners;
    }
    else{
        OWinners++;
        document.getElementById("scoreO").innerHTML = OWinners;
    }
    
}


function restart(){
    location.reload();
}

function newGame(){
    
    document.getElementById("theWinner").innerHTML = "  "
    document.getElementById("1").style.background = "#F0E68C";
    document.getElementById("1").innerHTML = "___";
    
    document.getElementById("2").style.background = "#F0E68C";
    document.getElementById("2").innerHTML = "___";
    
    document.getElementById("3").style.background = "#F0E68C";
    document.getElementById("3").innerHTML = "___";
    
    document.getElementById("4").style.background = "#F0E68C";
    document.getElementById("4").innerHTML = "___";
    
    document.getElementById("5").style.background = "#F0E68C";
    document.getElementById("5").innerHTML = "___";
    
    document.getElementById("6").style.background = "#F0E68C";
    document.getElementById("6").innerHTML = "___";
    
    document.getElementById("7").style.background = "#F0E68C";
    document.getElementById("7").innerHTML = "___";
    
    
    document.getElementById("8").style.background = "#F0E68C";
    document.getElementById("8").innerHTML = "___";
    
    document.getElementById("9").style.background = "#F0E68C";
    document.getElementById("9").innerHTML = "___";
    
}