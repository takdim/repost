a = int (input("input: "))
count = 0
for i in range(1, a+1):
    if ((a%i) == 0):
        print(i)
        count += 1
print(f'bayak faktor dari {a} adalah', count)