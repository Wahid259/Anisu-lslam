//Celsius to Faranhite
var farn = parseFloat(prompt("Enter Faranhite = "));

var cels = (farn - 32) * (5 / 9);

document.write("Celsius = " + cels);


// Faranhite to Celsius
var celsius = parseFloat(prompt("Enter Celsius = "));

var faranhite = (celsius*(9/5)) + 32;

document.write("Faranhite = " + faranhite);