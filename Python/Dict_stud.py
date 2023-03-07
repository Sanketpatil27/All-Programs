dict = {}
while True:
    name = input("type q to quit or enter stud name: ")
    
    if name == 'q':
        break
    
    scr = int(input ("Enter student score(0-10): "))
    
    if name in dict:
        dict[name] += (scr,)
    else:
        dict[name] = (scr, )
        
    for name in sorted(dict.keys()):
        adding = 0
        counter = 0
        
        for score in dict[name]:
            adding+=score
            counter+=1 
        print(name,":",adding/counter)
print(dict)