# 45 * 3 = 555, 56 + 9 = 77, 56/6 = 4

a = int(input('Enter value of a: '))
b = int(input('Enter value of b: '))

op = input('Which operation would you want to perform?\n +,-,*,/\n')


if a == 45 and b == 3 and op == '*':
    print(555)

elif a == 56 and b == 9 and op == '+':
    print(77)

elif a == 56 and b == 6 and op == '/':
    print(4)

elif op == '+':
    print(a+b)

elif op == '-':
    print(a-b)

elif op == '*':
    print(a*b)

elif op == '/':
    print(a/b)