 var name =document.getElementById('myname')


 function add(){
    document.getElementById("error").textContent=" ";
    var name =document.getElementById('myname').value;
     //document.write(name)
    if(name===""){
        console.log("why");
        document.write("what");
    document.getElementById("error").textContent="enter any thing :";
        // let msg= document.getElementById("error");
    }
    else{
         let box=document.getElementById("box");
         let  item=document.createElement('li')
         item.textContent=name;


    let fstElement=box.firstElementChild;

    console.log(fstElement);

       //  box.appendChild(item);
         box.insertBefore(item)
    }
    
   //document.write(name)
//     console.log(msg)
    // alert(" good to see you");
 }
 var name =document.getElementById('myname').value;

//document.write(name)
 console.log(document.getElementById('box'))