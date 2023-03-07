import pandas as pd

# list of strings
x = ['python', 'pandas']
y = [['python', 'pandas'],['second']]

# calling dataframe constructor on list
df = pd.DataFrame(x)
ff = pd.DataFrame(y)

print(df)
print(ff)