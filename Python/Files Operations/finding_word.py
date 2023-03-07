f = open('Files Operations/poem.txt', 'r')
data = f.read()


if 'twinkle' in data:
    print('it contain twinkle')
else:
    print('it doesnt contain twinkle!')

f.close()