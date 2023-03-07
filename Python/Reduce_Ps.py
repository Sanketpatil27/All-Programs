from functools import reduce

l = [23,490,96,64,93,56,34,63,874]

def maximum(a,b):
    return max(a,b)

print('maximum number in list is:', reduce(maximum, l))

# print('maximum number in list is:', reduce(lambda a,b: max(a,b), l))      # using lambda