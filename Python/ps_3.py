letter = '''Dear <|Name|>
            You are selected!
Date: <|Date|>'''

print(letter)
nm = input('Enter your name:\n')
dt = input('Enter Date:\n')

letter = letter.replace('<|Name|>', nm)
letter = letter.replace('<|Date|>', dt)
print(letter)