# 1 x 3 x 5 x 7 x ........ x n

n = int(input("Enter the lase number : "))
sum = 1

for x in range(1, n+1, 2):
    sum = sum * x
print(sum)
