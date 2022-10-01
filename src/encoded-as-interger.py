hello = 121404708493354166158910792

for i in range(11):
    char = hello & 0b11111111
    hello >>= 8
    print(chr(char), end="")
