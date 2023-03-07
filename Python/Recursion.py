f = 4

def fact(n):
    factN = 1 
    for i in range(n):
        factN *= i+1    # coz i starts with 0

    return factN

print(fact(f))



def factRec(n):
    if n == 1 or n == 0:
        return 1

    return n * factRec(n - 1)

print(factRec(f))