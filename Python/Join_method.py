# li = ['phone', 'laptop', 'HDD', 'SSD', 'Camera']
# li = ('phone', 'laptop', 'HDD', 'SSD', 'Camera')
li = {'phone', 'laptop', 'HDD', 'SSD', 'Camera', 'ipad'}

sentence = " and ".join(li)     # it inserts any string seperater to the given iterable objects(list, tuple or set) and return a string
# sentence = "\n".join(li)
print(sentence)
print(type(sentence))

words = ['hello', 'world', 'this', 'is', 'great']
print(" ".join(words))