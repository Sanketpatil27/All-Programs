# water beats gun
# gun beats snake
# snake beats water
import random


def game(comp, you):
    # it will chose its global variables, if not defined then it will create local variables that have no use
    global tie, flag,fall

# check all posibilities when comp choose 1(Snake)
    if comp == 1:
        if you == 1:
            print('You choose Snake \nComputer choose Snake')
            tie = 1
    
        elif you == 2:
            print('You choose Gun \nComputer choose Snake')
            flag = 1
    
        elif you == 3:
            print('You choose Water \nComputer choose Snake')
        
        else:
            print('Please Choose Correct Option!')
            fall = True
    

# check all posibilities when comp choose 2
    elif comp == 2:
        if you == 1:
            print('You choose Snake \nComputer choose Gun')

        elif you == 2:
            print('You choose Gun \nComputer choose Gun')
            tie = 1
            
        elif you == 3:
            print('You choose Water \nComputer choose Gun')
            flag = 1
            
        else:
            print('Please Choose Correct Option!')
            fall = True
            

# check all posibilities when comp choose 3
    elif comp == 3:
        if you == 1:
            print('You choose Snake \nComputer choose Water')
            flag = 1
            
        elif you == 2:
            print('You choose Gun \nComputer choose Water')
        elif you == 3:
            print('You choose Water \nComputer choose Water')
            tie = 1  
        else:
            print('Please Choose Correct Option!')
            fall = True
            

def gameDecision():
    if win > los:
        print(f'Decision:\nWinner,Congrats,You win {win} rounds')
    elif los > win:
        print(f'Decision:\nLoser,You lost {los} rounds!!!')
    else:
        print(f'Decision:\nThe game is Tie!!!')



win = 0     # to increase win's
los = 0     # to increase los's
t = 0       # to increase tie's
i = 1       # looping

print('\n\t\t\t\tWelcome To The Snake Water Gun Game')
print('\t\t\t\t-----------------------------------')
print("\nThere are five rounds,winner is who wins the most round's")


while i <= 5:
    flag = 0        # to check winning posibility
    tie = 0         # to check tie flag 
    fall = False

    print(f'\nRound {i}:')
    you = int(input('Enter 1.Snake  2.Gun  3.Water:\n'))
    comp = random.randint(1, 3)

    w = game(comp, you)  

    if not fall: 
        i += 1
    if fall: 
        flag == 1
    elif tie == 1:
        t += 1
        print("Game Tie!!!")
    elif flag == 1:
        print('You Win!')
        win += 1
    elif flag == 0:
        los += 1
        print('You Lose!')

gameDecision()