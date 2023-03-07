def gtr_than(n):
    if n > 5:
        return True
    else:
        return False


l = [1,2,3,4,5,6,34,23,56]

print(list(filter(gtr_than, l)))        # filter creates a list of elements which the function returns true

gt = lambda x: x > 10
print(list(filter(gt, l)))      