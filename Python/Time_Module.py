import time
from datetime import datetime
 
print(datetime.now())       # give the current time

initial1 = time.time()
print(initial1)          # milisecond accuressy

k = 0
while k < 40:
    print(k)
    k += 1
while_run_time = time.time() - initial1
print("while loop ran in:", while_run_time,"seconds!")            # show the time for execution of while loop


initial2 = time.time()
print(initial2)          

for i in range(40):
    # time.sleep(2) # pause for 2 seconds
    print(i)
for_run_time = time.time() - initial2
print("for loop ran in:", for_run_time,"seconds!")            # show the time for execution of for loop


print("for loop win") if for_run_time < while_run_time else print("while loop win")


localtime = time.asctime(time.localtime(time.time()))
# localtime = time.localtime(time.time())
print(localtime)