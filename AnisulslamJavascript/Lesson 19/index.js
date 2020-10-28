//1 + 2 + 3 +.........+10
var i = 1;
var sum = 0;

while(i <= 10)
{
    sum = sum + i;
    i = i + 1;
}
document.write("sum : " + sum);
document.write("<h1>End</h1>");

//---------------------------------------------

//2 + 4 + 6 + ................+100
var i = 2;
var sum = 0;

while (i <= 100) {
    sum = sum + i;
    i = i + 2;
}
document.write("sum : " + sum);
document.write("<h1>End</h1>");

//-----------------------------------------------

//Task - 6 write a program that will print sum of all the nmbers that are divided by 3 and 5 from 1-100

var i = 1;
var sum = 0;

while (i <= 100) {
    if (i%3==0 && i%5==0)
    {
        document.write(" " +i);
        sum = sum + i;
    }

    i = i + 1;
}
document.write(" sum : " + sum);
document.write("<h1>End</h1>");