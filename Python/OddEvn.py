odd = 0
evn = 0

num =int(input('enter a num or type 0 to stop: '))
while num != 0:
    if num%2 == 1:
        odd += 1 
    else: 
        evn += 1
    num = int(input('entr a num or type 0 to stop'))

print('odd nums: ', odd)
print ('evns: ', evn)