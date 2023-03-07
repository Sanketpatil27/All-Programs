l1 = [1, 2, 3, 4, 5 ,6, 7, 8, 9, 16, 19, 18]

# l2 = []
# [l2.append(i) for i in l1 if i % 2 == 0]  # this is also short-hand property used for appending

# short hand property for above program
# l2 = [i for i in l1 if i % 2 == 0]
# print(l1)
# print(l2)

# set comprehension
# set = {i for i in l1 if i > 6 }
# print(set)
# s1 = {dress for dress in ['dress1','dress1', 'dress2', 'dress3']}
# print(s1)


# Dictionary comprehension
d1 = {i:f"item {i}" for i in range(10) if i%2==0}
print(d1)
d1 = {value: key for key, value in d1.items()}          #  reverse dictionary
print(d1)