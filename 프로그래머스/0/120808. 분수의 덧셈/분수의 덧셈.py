import math

def solution(numer1, denom1, numer2, denom2):
    number = numer2*denom1 + numer1 * denom2 #분자
    denom = denom1 * denom2 #분모
    g = math.gcd(denom, number)
    return (number//g, denom//g)