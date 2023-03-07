# here we use a single for loop within list comprehension 
# and then convert it to set to remove duplicates and then again convert it to list.

def removeduplicates(lst):
    return list(set([i for i in lst]))            # easy way, using list comprehension

    # for i in lst:
    #     return list(set(i for i in lst))        # first make the set of items(coz set ignore repeted values) in lst then typecast it to list
        
    # return [t for t in (set(tuple(i) for i in lst))]
                              

l = [(1,3),(2,5),(6,8),(1,3),(9,6)]
print(l)

print(removeduplicates(l))