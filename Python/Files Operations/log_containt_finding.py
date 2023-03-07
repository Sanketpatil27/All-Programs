with open('Files Operations/log.txt') as f:
    data = f.read()

if 'python' in data.lower():
    print('Log contain python!!!')
else:
    print('Log doesn"t contain python!!!')