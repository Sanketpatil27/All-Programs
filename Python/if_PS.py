# Q1. check condition -->

# nm = input('Enter a username(max 10 chars) for your account: ')

# if (len(nm) <= 10):
#     print('Valid userName!')
# else:
#     print('Invalid userName!!!')


# Q2. check name is present in list or not  -->

# list = ['sanket', 'rohan', 'mohan', 'akshay']
# gs = input('Guess a name: ')

# if (gs in list):
#     print('this name is present in list!!!')

# else:
#     print('name is not in the list...')


# Q3. check the letter is about harry

# str = "hello harry how are you"

# if('harry' in str):
#     print('the letter is about harry!')
# else:
#     print('letter is not about harry.')


# Q4. spam recocgnizer


text = input('Enter a text: ')

if ('make a lot of money' in text):
    spam = True

elif ('buy this' in text) or ('look this' in text):
    spam = True

elif 'subscribe this' in text:
    spam = True

elif 'click this' in text:
    spam = True

else:
    spam = False

if spam:
    print('This is spam!!')

else:
    print('This is not spam..')
