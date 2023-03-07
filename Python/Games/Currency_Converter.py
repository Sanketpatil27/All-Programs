with open('Games/Currencys.txt') as f: 
    lines = f.readlines()
    # print(lines)          # to check lines in list  
    

# we cannot directly convert list to dict with typecasting, coz it needs keys and values
currencyDict = {}

for line in lines:
    parse = line.split('\t')                # it will made 1 string till \t comes
    # print(parse)                          # to check list in strings seperated after split
    currencyDict[parse[0]] = parse[1]       # like, dict['america'] = '43354' (in 0 position there is contry and in 1 pos there's value)
    
# print(currencyDict)       # to check dictionary of all values

amount = float(input('\nEnter amount in rs.: '))

print("Enter a name of currency you want to convert this amount to? \nfew options are: \n")

# short hand property for, keys in currencyDict.keys():  print(keys)
[print(key) for key in currencyDict.keys()]

convert = input('\nPlease enter some of these values: ')

if convert in currencyDict.keys():
    print(f"{amount} INR is equal to {amount * float(currencyDict[convert])} {convert}")
else:
    print("Please choose from the above currency!")