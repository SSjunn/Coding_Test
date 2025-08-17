def solution(my_string):
    M = ['a', 'e', 'i', 'o', 'u']
    answer = [ch for ch in my_string if ch not in M]
    return ''.join(answer)
