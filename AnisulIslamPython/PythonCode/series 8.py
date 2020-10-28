# 1 x 2 x 3 x 4 x ........ x n

n = int(input("Enter the lase number : "))
sum = 1

for x in range(1, n+1, 1):
    sum = sum * x
print(sum)
