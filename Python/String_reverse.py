a = 'akdf kdjfa kdfja'
print(a[::-1])


def reverse_words(text):    
    t = text.split(' ')
    s = ''
    for i in t:
        s += i[::-1]+' '
    return s
print(reverse_words(' we wertt tujn')) 

def reverse_words(str):
    return ' '.join(s[::-1] for s in str.split(' '))

print(reverse_words(' we wertt tujn'))