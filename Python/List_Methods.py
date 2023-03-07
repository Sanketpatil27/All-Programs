l1 = [1, 8, 7, 2, 21, 15, 21]
print(l1)

print('\nlength of list: ', len(l1))      # returns length of list

l1.sort()  # sorts the list, updates the entire list forever

l1.reverse()  # reverses the list

l1.append(45)  # adds 45 at the end of the list

# l1.extend((45,46))  # adds the tuple elements as two seperated element in list

l1.insert(2, 544)  # inserts 544 at index 2

l1.pop(2)  # removes element at index 2

l1.remove(21)  # removes 21 from the list, only first occurence
print(l1)

del l1[2]       # delete indexed element/s
del l1[2:4]     # delete from index 2 to 3(last is excluding)
print(l1)

l1.clear()
print(l1)

l2 = "adjka\tdaksk\tjksj"
parse = l2.split('\t')      # it will split the content till \t comes and make a list of items
print(parse)                # now parse is a list
