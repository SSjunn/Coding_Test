def solution(my_string):
    answer = [int(i) for i in my_string if '0'<= i <='9' ]
    answer.sort()
    return answer