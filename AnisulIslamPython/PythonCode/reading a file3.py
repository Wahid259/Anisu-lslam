file = open("student.txt","r+")
#print(file.writable())
text = file.readlines()[0]

print(text)



file.close()