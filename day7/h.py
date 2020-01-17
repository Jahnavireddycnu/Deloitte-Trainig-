for x in lista:
    for y in listb:
        if x==y:
            num.append(x)
for x in lista:
    for y in listb:
        if x==y:
            n_list.append(x)
lista = []
for var in 'Sankranti':
   lista.append(var)
lista
listb = [var for var in 'Sankranti']
listb
n_list = [r for r in range(12) if r%3==0]
n_list
lista = [7,3,4,5,6,2]
listb = [3,4,3,2,1,6,7]
num =[]
for x in lista:
    for y in listb:
        if x==y:
            n_list.append(x)
n_list
n_list = [x for x in list_a for y in list_b if x == y ]
lista = [7,3,4,5,6,2]
listb = [3,4,3,2,1,6,7]
num =[]
n_list = [x for x in list_a for y in list_b if x == y ]
n_list = [x for x in lista for y in listb if x == y ]
n_list
numa = []
for x in range(3):
    for y in range(x):
        numa.append( (x, y) )
numa
%logstart -o
%history -f h.py
