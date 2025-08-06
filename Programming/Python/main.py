# Display the current date and time 

import datetime

# Get the current date and time
now = datetime.datetime.now()
print("Current date and time: ", now)
# print(now.strtime("%Y-%m-%d %H:%M:%S"))
# Format the date and time as a string
# current_datetime = datetime.datetime.now()
# formatted_datetime = current_datetime.strftime("%Y-%m-%d %H:%M:%S")
# print("Formatted date and time: ", formatted_datetime)
# Print the current date and time in a specific format
formatted_datetime = now.strftime("%Y-%m-%d %H:%M:%S")
print("Formatted date and time: ", formatted_datetime)
# Print the current date and time in a different format 
# formatted_datetime = now.strftime("%d%m%Y %H:%M:%S")
print("Formatted date and time (ddmmyyyy): ", formatted_datetime)