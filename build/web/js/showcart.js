/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
}
