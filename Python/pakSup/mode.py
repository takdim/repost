a = int(input("input: "))

b = []

for i in range(0,a):
    b.append(int(input()))

maxV = 0
maxC = 0
for i in b:
    count = 0
    for j in range(0,a):
        if b[i] == b[j]:
            count +=1
    if count > maxC:
        maxC = count
        maxV = b[i]
print()
print("modus = ", maxV)