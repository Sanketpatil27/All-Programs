def game():
    return 3948

score = game()

with open('Files Operations/Game.txt') as f:
    hiScore = f.read()

if hiScore == "":
    with open('Files Operations/Game.txt', 'w') as f:
        f.write(str(score))

elif int(hiScore) < score:              #if hiScore is blank then can't convert to int
    with open('Files Operations/Game.txt', 'w') as f:
        f.write(str(score))