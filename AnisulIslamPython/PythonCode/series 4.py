# 4 + 8 + 12 .........  + n

n = int(input("Enter the lase number : "))
sum = 0

for x in range(4, n+1, 4): # 2 thekay suru hobe (n+1) deaci karon na delay n er agar value porjonto nebay, 2 babadhan deay cholbe
    sum = sum + x
print(sum)
