# Q1. greet names which starts with s in list->

l = ['harry', 'soham', 'sachin', 'mohan']

for name in l:
    if name.startswith('s'):
        print('hello', name)



# Q2. muti table using while

n = int(input('Enter a number: '))
i = 1
while i <= 10:
    print(f'{n} * {i} = {n * i}')
    i += 1

