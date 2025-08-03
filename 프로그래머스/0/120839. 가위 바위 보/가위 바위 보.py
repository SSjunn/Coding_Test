def solution(rsp):
    win = {'2' : '0', '0'  : '5', '5':'2'}
    answer = ''
    for ch in rsp:
        answer += win[ch]
    return answer