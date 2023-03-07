try:
    i = int(input('Enter a number: '))
    c = 1 / i 

except Exception as e:
    print(e)

else:                   # only execute when try block executed successfully, without going in except block
    print('code run successfully!!!')