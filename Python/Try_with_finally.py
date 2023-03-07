while True:
    try:
        i = int(input('Enter a number: '))
        c = 1 / i 
        break

    except Exception as e:
        print(e)
        exit()              # program will exit

    finally:                   # it always executed even program is exit() or return in above code
        print('we are done!!!')

print('outer side')