 #!/bin/python

from __future__ import print_function

import os
import sys

# Complete the solve function below.
def solve(n, operations):
    sum=0
    for i in range(len(operations)):
        sum=sum+((operations[i][1]-operations[i][0]+1)*operations[i][2])
    return sum/n
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = raw_input().split()

    n = int(nm[0])

    m = int(nm[1])

    operations = []

    for _ in xrange(m):
        operations.append(map(int, raw_input().rstrip().split()))

    result = solve(n, operations)

    fptr.write(str(result) + '\n')

    fptr.close()
