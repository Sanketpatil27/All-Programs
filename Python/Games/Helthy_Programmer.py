from datetime import datetime
from time import time
from pygame import mixer


def musicLoop(file, stoper):
     
    mixer.init()                        # Starting(initializing) the mixer
    mixer.music.load(file)              # load the music file to mixer
    mixer.music.play(-1)                # -1 to play sound repeatedly

    while True: 
        print(f"Press {stoper} to stop reminder!")
        print("Press 'e' to exit the program")
        query = input("")
        
        if query == stoper:
            mixer.music.stop()      # stoping the music  
            return 
                    
        elif query == 'e':
            exit()          # exit the program


# to store progress in the file 
def log_time(msg):
    with open("Games/Helth.txt", 'a') as f:
        f.write(f'{msg} {datetime.now()}\n')



if __name__ == "__main__":

    watersecs = 2#*60         # how many time after to start audio, this is in seconds, converted to minute by multiplying to 60
    eyessecs = 4#*60         
    exercisesec = 6#*60

    init_water = time()     # initialize the time to start from specific timr, udate each time
    init_eyes = time()
    init_exercise = time()

    while True:
        if ((time() - init_water) > watersecs):             # to check whether the drinking time gap is complete or not
            musicLoop("Games/DrinkWater.mp3", 'drank')
            log_time("drank water at")
            init_water = time()
        
        if ((time() - init_eyes) > eyessecs):
            musicLoop("Games/EyeCare.mp3", "ok")
            log_time("Eyes exercize at:")
            init_eyes = time()              # to update each time, for to not play after and after
            init_water = time()
        
        if ((time() - init_exercise) > exercisesec):
            musicLoop("Games/ExerciseWater.mp3", "done")
            log_time("Physical exercize at:")
            init_exercise = time()
            init_eyes = time()
            init_water = time()