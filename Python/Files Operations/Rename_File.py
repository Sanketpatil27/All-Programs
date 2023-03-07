import os 

with open('Files Operations/rename.txt') as f:
    data = f.read()

# os module function for removing file or content
# used to remove or delete a file path.
os.remove('Files Operations/rename.txt')

with open('Files Operations/renamed_by_python.txt', 'w') as f:
    f.write(data)