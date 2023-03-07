# print only 3rd 5th or 7th element(not index) of the list

li = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

for ind, i in enumerate(li):
    if ind == 2:
        print(f"The {ind+1}rd element is {i}")
    elif ind == 4 or ind == 6:
        print(f"The {ind+1}th element is {i}")