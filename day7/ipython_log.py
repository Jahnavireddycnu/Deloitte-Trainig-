# IPython log file

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
#[Out]# ['S', 'a', 'n', 'k', 'r', 'a', 'n', 't', 'i']
listb = [var for var in 'Sankranti']
listb
#[Out]# ['S', 'a', 'n', 'k', 'r', 'a', 'n', 't', 'i']
n_list = [r for r in range(12) if r%3==0]
n_list
#[Out]# [0, 3, 6, 9, 7, 3, 3, 4, 6, 2]
lista = [7,3,4,5,6,2]
listb = [3,4,3,2,1,6,7]
num =[]
for x in lista:
    for y in listb:
        if x==y:
            n_list.append(x)
n_list
#[Out]# [0, 3, 6, 9, 7, 3, 3, 4, 6, 2]
n_list = [x for x in list_a for y in list_b if x == y ]
lista = [7,3,4,5,6,2]
listb = [3,4,3,2,1,6,7]
num =[]
n_list = [x for x in list_a for y in list_b if x == y ]
n_list = [x for x in lista for y in listb if x == y ]
n_list
#[Out]# [7, 3, 3, 4, 6, 2]
numa = []
for x in range(3):
    for y in range(x):
        numa.append( (x, y) )
numa
#[Out]# [(1, 0), (2, 0), (2, 1)]
get_ipython().run_line_magic('history', '-f h.py')
get_ipython().run_line_magic('ldir', '')
get_ipython().run_line_magic('ls', '')
get_ipython().run_cell_magic('python2', '', 'print "hello"\n')
get_ipython().run_cell_magic('python3', '', 'print "hello"\n')
get_ipython().run_line_magic('python3', '')
print "hello"
get_ipython().run_line_magic('python2', '')
print "hello"
get_ipython().run_cell_magic('python2', '', 'print "hello"\n')
get_ipython().run_cell_magic('ruby', '', 'print "hello"\n')
n = [2,5,7,9,0]
sqrs = []
def sqr(arr):
    for i in n:
        sqrs.append(i**2)
    return asqrs
        
def sqr(arr):
    for i in n:
        sqrs.append(i**2)
    return sqrs
        
sqrs
#[Out]# []
def sqr(arr):
    sqrs[]
    for i in n:
        sqrs.append(i**2)
    return sqrs
        
def sqr(arr):
    sqrs = []
    for i in n:
        sqrs.append(i**2)
    return sqrs
        
sqrs
#[Out]# []
sqr(n)
#[Out]# [4, 25, 49, 81, 0]
def sql(arr):
    return [i**2 for i in arr]
sql(range(11))
#[Out]# [0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
get_ipython().run_line_magic('timeit(sq(range(11)))', '')
get_ipython().run_line_magic('timeit', 'sq(range(11))')
get_ipython().run_line_magic('timeit', 'sq(range(11))r')
get_ipython().run_line_magic('timeit', 'sqr(range(11))')
get_ipython().run_line_magic('timeit', 'sql(range(11))')
get_ipython().run_line_magic('timeit', 'sql(range(11))')
