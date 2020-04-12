a = int(input("input: "))

b = {}

#key = data
#value = banyak data
for i in range(0, a):
    data,value = map(int, input().split())
    b.__setitem__(data,value)

high = 0
for i in b:
    if b[i] > high:
        high = b[i]
print()
print("key = data, value = banyak data")
print(b)
print()
for i,j in b.items():
    print(i,j)


for i in b:
    if b[i] == high:
        print("modus = ",i)


