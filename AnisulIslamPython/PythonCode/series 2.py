# 2 + 4 + 6 .........  + n

n = int(input("Enter the lase number : "))
sum = 0

for x in range(2, n+1, 2): # 2 thekay suru hobe (n+1) deaci karon na delay n er agar value porjonto nebay, 2 babadhan deay cholbe
    sum = sum + x
print(sum)
