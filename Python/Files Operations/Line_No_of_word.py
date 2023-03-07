data = True
cnt = 1
with open('Files Operations/log.txt') as f:
    while data:
        data = f.readline()
        if 'python' in data.lower():
            print(f"python is present at line {cnt}")
            print("line:", data)    
            break
        cnt += 1