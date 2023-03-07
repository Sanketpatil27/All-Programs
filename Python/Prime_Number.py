num = int(input('Enter a number: '))
prime = True            # coz when type 2  it never gone in loop, so print prime!

for i in range(2,num):
    if (num%i == 0):
        prime = False
        break
    else:
        prime = True
        break

if prime:
    print(f'{num} is prime!')
else:
    print('Not prime..')