// Task 5 - input a letter and check it is vowel or consonant using switch

var letter = prompt("Enter any letter : ");
letter = letter.toLowerCase();

switch(letter){

    case "a":
        document.write("Vowel");
        break;

    case "e":
        document.write("Vowel");
        break;

    case "i":
        document.write("Vowel");
        break;

    case "o":
        document.write("Vowel");
        break;

    case "u":
        document.write("Vowel");
        break;

    default:
        document.write("Consonant");
}