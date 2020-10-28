file = open("student.txt","r+")
#print(file.writable())

for line in file:
    print(line)



file.close()