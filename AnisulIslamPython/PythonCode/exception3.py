# exception asbe but finally er ginish gula print korbe
try:
    list = [20, 0, 30]
    result = list[0] / list[3]
    print(result)
    print("Done")

except ZeroDivisionError:
    print("Dividing by zero is not possible")

finally:
    print("Successful")