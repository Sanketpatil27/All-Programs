myDict = {
    'name': 'harry',
    'type': 'quick manner',
    'channel': 'cwh',
    'anotherdict': {'name1': 'carry',
                    'ch': 'eng'},

    'list': [1, 34, 45, 23],
    12: 89
}

print("\n", myDict.keys())      # returns all keys of the dictionary
print(myDict.values())          # returns all values of the dictionary
print(myDict.items())           # returns all (keys,values) pairs tuple for all contents of dictionary


updated = {
    'harry': 'logic builder',
}

myDict.update(updated)          #add the contents at the last of the dictionary

print(myDict.get('list'))       #similar to down, but it return none if key is not found, 
print(myDict['list'])           # it return error if key is not found

print(myDict.pop(12))           # return valur of poped key

print(myDict)