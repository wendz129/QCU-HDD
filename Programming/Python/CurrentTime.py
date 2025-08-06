# #!/usr/bin/python3

import time

t = time.localtime(time.time())
localtime = time.asctime(t)
str = "Current Time:" + time.asctime(t)
# when true tries to save it and compile it
print(str)

# print("Current time")
# print(50)