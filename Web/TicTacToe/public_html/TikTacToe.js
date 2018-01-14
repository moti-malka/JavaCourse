/*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/* 
    Created on : Jan 13, 2018, 9:44:04 PM
    Author     : Motim
*/
var XO = "X"
var ind = 1;

function insertXO(td){
    
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

function CheckWinner(td){
    var x = td.value;
    alert(x);
    
}



function restart(){
    location.reload();
}