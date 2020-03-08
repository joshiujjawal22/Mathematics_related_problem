#!/bin/python

from __future__ import print_function

import os
import sys

#
# Complete the strangeGrid function below.
#
def strangeGrid(r, c):
    r_st=0
    if(r%2==0): 
        r_st=(r/2-1)*10
        return (r_st)+((c-1)*2+1)
    else:
        r_st=r/2*10
        return (r_st)+((c-1)*2)
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    rc = raw_input().split()

    r = int(rc[0])

    c = int(rc[1])

    result = strangeGrid(r, c)

    fptr.write(str(result) + '\n')

    fptr.close()
