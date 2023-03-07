import random

# num = random.randint(0, 12)     # it will return output including start and end
# print(num)

rand = random.random()*100     # it will return output from 0 to 100(consider n- 1) in floats
print(rand)

lst = ['sony pal', 'aaj tak', 'code with harry']
tpl = ('max', 'kal tak', 'cwh')
ch = random.choice(lst)         # it will return any of the list randomly
ch = random.choices(lst)         # it will return any of the list randomly in form of list
print(ch)
print(type(ch))