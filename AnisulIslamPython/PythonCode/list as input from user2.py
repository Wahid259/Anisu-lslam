
numOfWords = 0
numOfLetters = 0
numOfDigits = 0

text = input("Enter a text of numbers : ") #My name is 123

for x in text:
    x = x.lower()
    if x >= 'a' and x <= 'z':
        numOfLetters = numOfLetters + 1

    elif x >= '0' and x <= '9':
        numOfDigits = numOfDigits + 1

    elif x == ' ':
        numOfWords = numOfWords + 1

print("Nymber of letters : ",numOfLetters)
print("Number of degets : ",numOfDigits)
print("Number of words : ",numOfWords + 1)


