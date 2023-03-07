import matplotlib.pyplot as plt

player = ['virat', 'rohit', 'shikhar', 'hardik']
runs = [45, 46, 67, 89]

# plt.barh(player, runs, color = 'orange')        # for horizantal bar
plt.bar(player, runs, color = 'orange')
plt.title('Score Card')                         # Title of the graph
plt.xlabel('Players')                           # name for the x labels
plt.ylabel('Runs')                              # name for the y labels
plt.show()