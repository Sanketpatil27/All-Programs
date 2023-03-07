age = int(input('Enter your age: '))

if (age < 18):
    print('You cannot get licence!!!')

elif (age == 21):
    print('You have to vote for elections...')

else:
    print('Eat 5 Star Do Nothing!')


# short hand property
# print('You cannot get licence!!!') if (age < 18) else print('Eat 5 Star Do Nothing!')