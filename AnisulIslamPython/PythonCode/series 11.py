# 4 x 8 x 12 x 16 x ........ x n

n = int(input("Enter the lase number : "))
sum = 1

for x in range(4, n+1, 4):
    sum = sum * x
print(sum)
