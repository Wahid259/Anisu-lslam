# 1^2 + 2^2 + 3^2 .........  + n^2

n = int(input("Enter the lase number : "))
sum = 0

for x in range(1, n+1, 1): # 2 thekay suru hobe (n+1) deaci karon na delay n er agar value porjonto nebay, 2 babadhan deay cholbe
    sum = sum + x*x
print(sum)
