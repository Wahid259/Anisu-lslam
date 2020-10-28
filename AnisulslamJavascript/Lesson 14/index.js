

//letter grade
//user marks input
//A+(80-100)
//A(70-79)




//D(33-39)
var marks = prompt("Enter your marks : ")
if(marks >= 80)
    document.write("A+");

else if (marks >= 70)
    document.write("A");

else if (marks >= 60)
    document.write("A-");
    
else if (marks >= 50)
    document.write("B");

else if (marks >= 40)
    document.write("C");

else if (marks >= 33)
    document.write("D");

else//if (marks == 0)
    document.write("Fail");