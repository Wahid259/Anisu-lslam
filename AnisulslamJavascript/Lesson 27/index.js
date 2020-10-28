//Guessing Game
//Guess a number from 1 to 5
//Generate a random number between 1 to 5
//If the number matches random number; then show nessage won else lost
//Run the game for 5 times
//Show the number of wons and losts

var numberOfWon = 0;
var numberOfLost = 0;

for (var i=1; i<=5; i++)
{
    var guessNumber = parseInt(prompt("Enter a number from 1 to 5 : "));

    var randomNumber = Math.floor(Math.random() * 5) + 1;

    if (guessNumber == randomNumber) {
        console.log("You Have Won");
        numberOfWon++;
    } else {
        console.log("You Have Lost. Random Number was = " + randomNumber);
        numberOfLost++;
    }
}
document.write("Number of won = "+ numberOfWon + "<br>");
document.write("Number of Lost = " + numberOfLost + "<br>");
