
# 2 + 4 + 6 + ............... + n

n = int(input("Enter the last term : "))
sum = 0

i = 2
while i <= n:
    print(i)
    sum = sum + i
    i = i + 2

print("Sum is : ",sum)