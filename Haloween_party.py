#!/bin/python

from __future__ import print_function

import os
import sys

#
# Complete the halloweenParty function below.
#
def halloweenParty(k):
    return (k/2)*(k-k/2)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(raw_input())

    for t_itr in xrange(t):
        k = int(raw_input())

        result = halloweenParty(k)

        fptr.write(str(result) + '\n')

    fptr.close()
