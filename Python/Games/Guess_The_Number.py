import random


print("\n\t\t\t\t  || GUESS THE NUMBER || \n")
num = random.randint(1,100)


guesses = 1    # number of guesses, 1 coz it has no chance to increment after it correct, it break without increment
while True:  
    u = int(input('\nguess the number between 1 to 100: '))

    if u == num:
        print('You guess it correct')
        break
    elif u > num :
        print('The number you have chosen is Large to correct!')
    elif u < num: 
        print('The number you have chosen is Less to correct!') 
    guesses += 1


print(f'\nCongratulations, You Guess the correct number After taking Total number of guesses: {guesses}')


# Storing HiScore
with open('Games/HiScore.txt') as f:
    score = f.read()
    

hiScore = guesses

if score == '':
    with open('Games/HiScore.txt', 'w') as f:
        f.write(str(guesses))

elif int(score) < guesses:
    hiScore = int(score)
    
elif int(score) > guesses:
    with open('Games/HiScore.txt', 'w') as f:
        f.write(str(guesses))
    hiScore = guesses 


print(f'Hiscore = {hiScore} Guess')