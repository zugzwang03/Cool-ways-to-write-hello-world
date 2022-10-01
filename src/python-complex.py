print("".join([letter for letter in "hello world"])) 
#---- 
print("".join([(lambda x:x.upper())(letter) for letter in "hello world"])) 
#---- 
print("".join([(lambda x:x.upper())(letter) if letter in "hw" else letter for letter in "hello world"])) 
#---- 
import itertools; print("".join([(lambda x:x.upper())(letter) if letter in "hw" else letter for letter in itertools.chain("hello ","world")])) 
#---- 
print("".join([(lambda x:x.upper())(letter) if letter in "hw" else letter for letters in zip("hlowrd","el ol.") for letter in letters ])) 
#---- 
p = lambda x: ( -13214 * x**11 + 956318 * x**10 - 30516585 * x**9 + 564961485 * x**8 
                - 6717043212 * x**7 + 53614486464 * x**6 - 291627605005 * x**5 
                + 1074222731065 * x**4 - 2606048429424 * x**3 + 3927289106268 * x**2 
                - 3265905357360 * x + 1116073728000 ) / 19958400 
 
print bytearray(map(p, range(1, 13))) 
