def increment(num):
    try:
        return int(num) + 1
    except:
        raise ValueError('This is not valid...')

n = increment('98i')
print(n)
# print('hello')