def readFile(filename):
    try:
        with open(filename) as f:
            data = f.read()
            print(data)
    except FileNotFoundError:
        print(f"File {filename} is not found!!")

readFile('1.txt')
readFile('19.txt')
readFile('2.txt')
readFile('3.txt')