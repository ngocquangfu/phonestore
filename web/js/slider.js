/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function zoomout(e){
    document.getElementById("image").src = e.src;
}

function quantity(type) {
    var number = parseInt(document.getElementById("num").value);
    document.getElementById("num").value = number + (type?1:(number <= 0?0:-1));
    var old = document.getElementById("sender").href;
    
    
 document.getElementById("sender").href = old.substring(0, old.lastIndexOf("=")+1)+document.getElementById("num").value
}

function cartQuantity(type) {
    var number = parseInt(document.getElementById("num").value);
    document.getElementById("num").value = number + (type?1:(number <= 0?0:-1));
    var old = document.getElementById("sender").href;
    
    
 document.getElementById("sender").href = old.substring(0, old.lastIndexOf("=")+1)+document.getElementById("num").value
}
window.onload = () =>{
    let num = document.getElementsByClassName("num"); // lay tat ca cai feild cart
    [...document.getElementsByClassName("subBtn")].forEach((el, id)=>{
        console.log("hey")
        el.onclick = () =>{
            
            num[id].value = num[id].value-((num[id].value)<=0?"0":1);
        }
    });
    
    [...document.getElementsByClassName("addBtn")].forEach((el, id) => {
        console.log("hey")
        el.onclick = () => {

            num[id].value = parseInt(num[id].value)+1;
        }
    }); 
    var arr=[];
    arr.push(num[id]);
    document.getElementById("number").value=arr;
    console.log(arr)
    
    
}
