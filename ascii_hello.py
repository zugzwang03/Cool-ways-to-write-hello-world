s = 'Hello World!'
sum_h = sum(ord(i) for i in s)
while s:
    y = sum_h - sum(ord(i) for i in s[1:])
    sum_h = sum(ord(i) for i in s[1:])
    s = s[1:]
    print(chr(y), end='')
print('')