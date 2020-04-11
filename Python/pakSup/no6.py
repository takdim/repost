# min input 3 data
a = int(input("n: "))
b = {}

for i in range(0,a):
    b.__setitem__(input("nama: "), int(input("nilai: ")))

print()
print(b)
b = sorted(b.values())
#nama sesuai nilainya
print("rank 1 = ", b[len(b)-1])
print("rank 2 = ", b[len(b)-2])
print("rank 3 = ", b[len(b)-3])
