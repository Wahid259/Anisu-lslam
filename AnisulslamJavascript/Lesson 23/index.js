
// var num =[10,20,30,40,50];
// var sum = 0;

// for(var i=0; i<5; i++)
// {
//     document.write(num[i]);
//     document.write("<br>");
//     sum = sum + num[i];
// }
// document.write("Sum = " + sum);
// document.write(num[0]);
// document.write(num[1]);
// document.write(num[2]);
// document.write(num[3]);
// document.write(num[4]);
//----------------------------------------------------------------

var num = new Array();

for(var i=0; i<5; i++)
{
    num[i] = parseInt(prompt("Enter a number : "));
}
var sum = 0;

for (var i = 0; i < 5; i++) {
    document.write(num[i]);
    document.write("<br>");
    sum = sum + num[i];
}
document.write("Sum = " + sum);