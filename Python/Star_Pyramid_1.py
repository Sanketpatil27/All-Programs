n = int(input('Enter a rows in pyramid: '))

for i in range(1,(n+1)):
    # spaces
    print(end=" " * (n-i))

    j = 1
    while j <= i:
        print(end='* ')
        # print(end=f'{i} ')            #for printing number pyramid
        j += 1
    else:
        print("")
        