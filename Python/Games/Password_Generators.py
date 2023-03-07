import string, random

s1 = string.ascii_letters         # contain all the uppercase and lowercase letters
# print(s1)

# s2 = string.ascii_lowercase
# print(s2)

# s3 = string.ascii_uppercase
# print(s3)

s4 = string.digits
# print(s4)

s5 = string.punctuation
# print(s5)


ps = []

ps.extend(s1)       # extend add the elements of list, not like append(it adds the list as it is)
# ps.append(s1)       # append will get all string in one list item
# ps.extend(s2)
# ps.extend(s3)
ps.extend(s4)
ps.extend(s5)

# print(ps)  # list content

plen = int(input("Enter length of the password: "))

random.shuffle(ps)      # shuffle the contents of list 
print("".join(ps[:plen]))


print("".join(random.sample(ps, plen)))     # it will give sample numbers till length

# print(ps[:plen])      # it will get in list