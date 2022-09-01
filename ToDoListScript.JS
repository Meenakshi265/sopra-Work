 var name =document.getElementById('myname')



 function add(){
    document.getElementById("error").innerHTML=" ";
    var name =document.getElementById('myname').value;
    if(name==""){
    document.getElementById("error").innerHTML=" <br>Enter any thing :";

    }
    else{
         let box=document.getElementById("box");
         let  item=document.createElement('li')
         item.textContent=name;
         let fstElement=box.firstElementChild;
         console.log(fstElement);
        box.appendChild(item);
        //  box.insertBefore(item)
    }
 }
//  var name =document.getElementById('myname').value;
//  console.log(document.getElementById('box'))