file = open("student.txt","r+")
#print(file.writable())
text = file.readlines()

print(text)



file.close()