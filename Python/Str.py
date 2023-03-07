str = "0165031806510"

for c in str:
    if c == "0":
        str = str.replace("0", "x")
    else:
        continue
    
    
print(str)