a = int(input("input: "))

b = {}

#key = data
#value = banyak data
for i in range(0, a):
    b.__setitem__(int(input()), int(input()))

high = 0
for i in b:
    if b[i] > high:
        high = b[i]
print()
print("key = data, value = banyak data")
print(b)
print()
for i in b:
    if b[i] == high:
        print("modus = ",i)


