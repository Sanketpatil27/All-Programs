l = [1, 2, 3, 4, 50, 6, 7, 89, 90, 69, 60]

def filterfun(l):
    if l%5 == 0:
        return True
    else: 
        return False

print(list(filter(filterfun, l)))


print(list(filter(lambda x: x%5 == 0, l)))          # using lambda
