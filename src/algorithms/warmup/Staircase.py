n = int(input())
for i in range(0, n):
    s = ''
    for j in range(0, n):
        if j < n - i - 1:
            s += ' '
        else:
            s += '#'
    print(s)
