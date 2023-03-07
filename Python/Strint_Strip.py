# remove a given word from list and strip it

def removeS(str, w):
    newS = str.replace(w, "")
    return newS.strip()             # strip remove the leading and trailing spaces


str = '     Hello coder!    '
print(str)

rem = input('Enter a removal word: ')
print(removeS(str, rem))