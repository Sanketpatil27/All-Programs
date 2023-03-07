str = 'hello How are you, are programer'
print('\nlength of string:', len(str))


print("is ends with:", str.endswith("r"))      # return true or false
print("is ends with:", str.endswith("mer"))
print("is starts with:", str.startswith("he"))
print("count number of e:", str.count('e'))
print("count number of are:", str.count('are'))
print("count number of capital H:", str.count('H'))  # only count capital H

# lower or upper
rand = 'great morning great programer aim'

print("\nstring using capitalize method:", rand.capitalize())      # This make first letter capital of string
print("find a:", rand.find('a'))                                   # returns index of first occurence of word / letter
print("find great:", rand.find('great'))
print("find great:", rand.find('g9reat'))                          # return -1 if not found

new = 'this is for new string for new functions testing'
print("\n" + new)

print('replaces:', new.replace('for', '4r'))            # first is old character and second is new character, chanes all occurences
print('replaces:', new.replace('f', 'm'))


str11 = "   et  et   "
print(len(str11))

x = str11.strip()       # remove leading and trailing spaces
print(x)
print(len(x))


l2 = "adjka\tdaksk\tjksj"
p = l2.split('\t')      # it will split the content till \t comes and make one list item
print(p)                # now p is a list