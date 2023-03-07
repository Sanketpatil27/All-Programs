# else only print when for loop is naturelly (not manually) ends, otherwise it will not execute

li = [2, 334, 45, 456, 6]

for nums in li:
    print(nums)

    if nums == 45:
        break
else:
    print('Done!!!')



# it also can be used with while loop

i = 1
while i < 3:
    print(i)
    i += 1
else:
    print('Done!!!')
