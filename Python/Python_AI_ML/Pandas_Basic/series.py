import pandas as pd
import numpy as np

info = np.array(['p','a','n','d', 'a', 's'])
a = pd.Series(info)
print(a)

# 2.
# take indexes as alphabets
info = {'x': 0, 'y': 1, 'z': 2}
a = pd.Series(info)
print(a)