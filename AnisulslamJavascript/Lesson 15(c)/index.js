//Vowel / Consonnanr

var letter = prompt("Enter a letter : ");

letter= letter.toLowerCase();

if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u" ||
         letter == "A" || letter == "E" || letter == "I" || letter == "O" || letter == "U")
    document.write("Vowel");

else
document.write("Consonant");