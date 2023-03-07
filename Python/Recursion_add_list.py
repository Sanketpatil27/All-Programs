def sumList(list, n):
    if n == 0:
        return list[0]

    return list[n] + sumList(list,n-1)


list = []
n = int(input('How many indexes do you want in list: '))

for i in range(n+1):
    list.append(int(input(f'Enter item at index {i}: ')))

sum = sumList(list,n)

print('\nSum of list numbers: ', sum)