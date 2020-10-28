// Task 5 - input a letter and check it is vowel or consonant using switch

var letter = prompt("Enter any letter : ");
letter = letter.toLowerCase();

switch(letter){

    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
        document.write("Vowel");
        break;

    default:
        document.write("Consonant");
}