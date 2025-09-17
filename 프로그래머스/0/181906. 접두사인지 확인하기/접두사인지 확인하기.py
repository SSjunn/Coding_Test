def solution(my_string, is_prefix):
    answer = 0
    banana = []
    
    for i in range(len(my_string)):
        banana.append(my_string[0: i+1])

    if is_prefix in banana:
        answer = 1
        
    return answer