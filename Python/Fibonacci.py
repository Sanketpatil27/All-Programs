# 0 1 1 2 3 5 8 13

def fibo(n):
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return fibo(n - 1) + fibo(n - 2)


n = int(input("Enter a number: "))
print(f'fibonacci of {n} is: ', fibo(n))
