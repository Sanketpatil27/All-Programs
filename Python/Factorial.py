a = int(input('Enter a number for factorial: '))
fact = 1 

for i in range(1,(a+1)):
    fact *= i 

print(fact)