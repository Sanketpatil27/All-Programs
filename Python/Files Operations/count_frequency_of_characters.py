import collections
import pprint


# with open('count_freq.txt', 'r') as f:
#     count = collections.Counter(f.read().upper())
#     value = pprint.pformat(count)

# print(value)


dict = {}           # defining empty dictionary

with open("Files Operations/count_freq.txt", "r") as f:
    data = f.read()
    for char in data:                # traverse each char in file
        if char not in dict.keys():
            dict[char] = 1
        else:
            dict[char] += 1

print('Occurences of each char in file')

for key, val in dict.items():
    print(key, ": ", val)



# output:
# intput file is: aaa bbb cccc dddddd
# Occurences of each char in file
# a :  3
#   :  3        # this is counting the space char
# b :  3
# c :  4
# d :  6