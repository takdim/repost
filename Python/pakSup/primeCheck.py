num = int(input("hhh: "))

if num > 0:
    for i in range(2, num//2):
        if((num%i )== 0):
            print(num, " is not prime")
            break
        else:
            print("is prime")
else:
    print(num, "is not prime")