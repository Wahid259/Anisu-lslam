# 1 + 2 + 3 .........  + n

n = int(input("Enter the lase number : "))
sum = 0

for x in range(1, n+1, 1): # 1 thekay suru hobe (n+1) deaci karon na delay n er agar value porjonto nebay, 1 babadhan deay cholbe
    sum = sum + x
print(sum)
