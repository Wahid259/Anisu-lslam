# 1 + 1/2 + 1/3 .........  + 1/n

n = int(input("Enter the lase number : "))
sum = 0

for x in range(1, n+1, 1): # 2 thekay suru hobe (n+1) deaci karon na delay n er agar value porjonto nebay, 2 babadhan deay cholbe
    sum = sum + x/2
print(sum)
