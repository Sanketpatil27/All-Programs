words = ['donkey', 'monkey', 'fuddu']

f = open('Files Operations/update.txt')
data = f.read()

for items in words:
    data = data.replace(items, '#$@^&&#')

with open('Files Operations/update.txt', 'w') as f:
    f.write(data)
