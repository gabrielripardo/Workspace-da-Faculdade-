
/*	On the code JavaScript has iqual at Java in anythings.
		Variables: starting the declaration using the reserve word var and the after the identificator.
		Structs: 
			Condition
				for = same at java
				while = same at java
			Repetition
				if = same at java
		Arrays: declaration diferent of the java.	
		Methods: In the JavaScript are call of the function. Not has declaration for void, because is very simple.
*/
// This function has return 
function valorFrete (produto){
	total = 10 + produto;
return total;
}		

// This function is void
function funcPrint(){
	document.write("<br>Teste, teste, função sem retorno");
}

document.write(valorFrete(500));		
funcPrint();

// Struct if, else
var boolean = true;
if(boolean){
	document.write("<br>expressão verdadeira!");
}
else{
	document.write("<br>expressão falsa!");
}


// Struct while 
var num = 0;
while(num < 10){
	document.write("<br>" + num);
	num = num + 1;
}

// Strunct for
for(i = 0; i < 20; i++){
	document.write("<br>" + i);
}

// Array
var myList = new Array();
myList[0] = 43;
myList[1] = 32;
myList[2] = 41;

document.write("<br>Length: " + myList.length);
document.write("<br>Method join: " + myList.join() + " << all the values");
document.write("<br>Method sort: " + myList.sort() + " << all the values ordened");
