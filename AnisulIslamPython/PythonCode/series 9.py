# 2 x 2 x  x  x ........ x n

n = int(input("Enter the lase number : "))
sum = 1

for x in range(2, n+1, 2):
    sum = sum * x
print(sum)
