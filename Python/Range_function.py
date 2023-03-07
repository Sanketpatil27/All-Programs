# Range function is used to generate sequence of numbers
# range start from default 0, 0 to (n-1)

# for i in range(8):
#     print(i)



# this starts from 2 (start,end)

# for i in range(2,6):
#     print(i)



# increment of 3 in each time (start, end, increment)

# for i in range(3, 31, 3):
#     print(i)

l = []
for i in range(12,0,-1):
    l.append(i)
    print(i)

print(l)    # or 
print(list(range(12,0,-1)))

