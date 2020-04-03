genap = 0
ganjil = 0
positif = 0
negatif = 0

a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())

if a%2 == 0:
    if a > 0:
        genap += 1
        positif += 1
    elif a < 0:
        genap += 1
        negatif += 1
    else:
        genap += 1
else:
    if a > 0:
        ganjil += 1
        positif += 1
    elif a < 0:
        ganjil += 1
        negatif += 1

if b%2 == 0:
    if b > 0:
        genap += 1
        positif += 1
    elif b < 0:
        genap += 1
        negatif += 1
    else:
        genap += 1
else:
    if b > 0:
        ganjil += 1
        positif += 1
    elif b < 0:
        ganjil += 1
        negatif += 1

if c%2 == 0:
    if c > 0:
        genap += 1
        positif += 1
    elif c < 0:
        genap += 1
        negatif += 1
    else:
        genap += 1
else:
    if c > 0:
        ganjil += 1
        positif += 1
    elif c < 0:
        ganjil += 1
        negatif += 1

if d%2 == 0:
    if d > 0:
        genap += 1
        positif += 1
    elif d < 0:
        genap += 1
        negatif += 1
    else:
        genap += 1
else:
    if d > 0:
        ganjil += 1
        positif += 1
    elif d < 0:
        ganjil += 1
        negatif += 1

if e%2 == 0:
    if e > 0:
        genap += 1
        positif += 1
    elif e < 0:
        genap += 1
        negatif += 1
    else:
        genap += 1
else:
    if e > 0:
        ganjil += 1
        positif += 1
    elif e < 0:
        ganjil += 1
        negatif += 1


print(genap, " bilangan genap")
print(ganjil, " bilangan ganjil")
print(negatif, " bilangan negatif")
print(positif, " bilangan positif")