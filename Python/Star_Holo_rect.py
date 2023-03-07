n = int(input('Enter a rows in pyramid: '))
i = 0

while i < n:
    j = 0

    print("")
    while j < n:
        if i == 0 or i == n-1 or j == 0 or j == n-1:
            print(end='*')
        else:
            print(end = " ")
        j += 1

    i += 1