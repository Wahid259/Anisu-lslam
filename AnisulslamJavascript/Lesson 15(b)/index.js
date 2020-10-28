var num1 = prompt("Enter number1 : ");
var num2 = prompt("Enter number2 : ")
var num3 = prompt("Enter number3 : ")

if(num1 > num2 && num1 > num3)
    document.write("Large Number = "+ num1);

else if (num2 > num1 && num2 > num3)
    document.write("Large Number = " + num2);

else
    document.write("Large Number = " + num3);

