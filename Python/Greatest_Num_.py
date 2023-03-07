a = int(input('\nEnter any four numbers to find largest number:\na: '))
b = int(input('b: '))
c = int(input('c: '))
d = int(input('d: '))

if (a > b):
    if (a > c):
        if (a > d):
            print('a is greater!')
        else:
            print('d is greater!')
    elif (c > d):
        print('c is greater!')
    else:
        print('d is greater!')

elif (b > c):
    if (b > d):
        print('b is greater!')
    else:
        print('d is greater!')

elif (c > d):
    print('c is greater!')

else:
    print('d is greater!')


# simplified ->

if a > c :
    gt = a
else:
    gt = c

if b > d:
    gt2 = b
else:
    gt2 = d    

if gt > gt2:
    print(gt, 'is greater')    
else:
    print(gt2, 'is greater')


# simplest: 
print(max(a,b,c,d))