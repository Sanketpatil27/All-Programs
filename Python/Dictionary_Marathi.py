# Q1. Marathi Dictionary  ==>

myDict = {
    'pankha': "fan",
    'ushi': 'pillow',
    'ghadi': 'watch'
}

print('Search English meaning for these words:', myDict.keys())
srch = input() 
print('Meaning of your word is:', myDict.get(srch))     #use get() to avoid errors



# Q2. ==>
dict = {}
print(dict)

n1 = input("Enter your name: ")
l1 = input("Enter your favourite language: ")
n2 = input("Enter your name: ")
l2 = input("Enter your favourite language: ")



updated = {
    n1: l1,
    n2: l2
}

dict.update(updated)
print("Dictionary of students with their fav languages:\n",dict)