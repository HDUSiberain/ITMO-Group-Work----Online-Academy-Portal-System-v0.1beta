function stu_login(){
	var pwd = document.getElementById("pwd");
	var loginInfo ={};
	loginInfo.uId = document.getElementById("uId").value;
	loginInfo.pwd = document.getElementById("pwd").value;
	loginInfo.identity ="student";
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		if(xhr.readyState !== 4){
			return;
		}
		if(xhr.status>=200 && xhr.status<=300){
			alert("log in successfully!")
		}else{
			console.error("fail!");
		}
	}
	
	xhr.send(JSON.stringify(loginInfo));
}
function teacher_login(){
	var pwd = document.getElementById("pwd");
	var loginInfo ={};
	loginInfo.uId = document.getElementById("uId").value;
	loginInfo.pwd = document.getElementById("pwd").value;
	loginInfo.identity ="teacher";
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		if(xhr.readyState !== 4){
			return;
		}
		if(xhr.status>=200 && xhr.status<=300){
			alert("log in successfully!")
		}else{
			console.error("fail!");
		}
	}
	xhr.send(JSON.stringify(loginInfo));
}
function ad_login(){
	var pwd = document.getElementById("pwd");
	var loginInfo ={};
	loginInfo.uId = document.getElementById("uId").value;
	loginInfo.pwd = document.getElementById("pwd").value;
	loginInfo.identity ="administrator";
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		if(xhr.readyState !== 4){
			return;
		}
		if(xhr.status>=200 && xhr.status<=300){
			alert("log in successfully!")
		}else{
			console.error("fail!");
		}
	}
	xhr.send(JSON.stringify(loginInfo));
}