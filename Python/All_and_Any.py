subs = 23
liks = 23000
conditions = [subs > liks, liks > 2300]     # for checking multiple conditions

if all(conditions):
    print('all are true')

elif any(conditions):
    print('at least one true')