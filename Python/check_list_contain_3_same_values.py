list = [3,4,5,5,5,6,78,9,56,7,7.0,7,89]

print(list)
size = len(list)

print('Values which are repeted 3 times: ')

for i in range(size-2):
    if list[i] == list[i + 1] and list[i + 1] == list[i + 2]:
        print(list[i])
