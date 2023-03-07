myDict = {
    'name': 'harry',
    'type': 'quick manner',
    'channel': 'cwh',
    'anotherdict': {'name1': 'carry',
                    'ch': 'eng'},

    'list': [1,34,45,23],
    12: 89
}

andict = {}
print("This is empty dictionary:",andict)
andict['hello'] = 'hii'
andict['hmmm'] = 'ok'
print(andict)


                            #cannot contain duplicate keys
print(myDict)
print(list(myDict))         # typecast to list, convert only keys to list 
print(myDict['name'])
print(myDict['anotherdict'])
print(myDict['anotherdict']['name1'])       # it will print value of name1 key in anotherdicr


myDict['name'] = 'Larry'        # Dictionary is mutable, we can change it
print(myDict['name']) 
