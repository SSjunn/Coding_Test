def solution(my_string, n):
    answer = ''
    for s in my_string: # 문자열의 각 문자를 하나씩 가져온다.
        answer+=s*n
    return answer
'''
def solution(my_string, n):
    answer = ''
    for i in range(len(my_string)):
        answer += my_string[i] * n
    return answer
'''