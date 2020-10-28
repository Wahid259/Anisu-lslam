# 1^2 x 2^2 x 3^2 x 4^2 x ........ x n

n = int(input("Enter the lase number : "))
sum = 1

for x in range(1, n+1, 1):
    sum = sum * x*x
print(sum)
