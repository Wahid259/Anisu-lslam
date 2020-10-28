# 2^2 x 4^2 x 6^2 x ........ x n

n = int(input("Enter the lase number : "))
sum = 1

for x in range(2, n+1, 2):
    sum = sum * x*x
print(sum)
