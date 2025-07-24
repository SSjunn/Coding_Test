def solution(my_string, letter):
    return my_string.replace(letter, "")
# 문자열.replace(바꿀문자, 새로운 문자)

'''
    def solution(my_string, letter):
        result = ""
        for ch in my_string:
            if ch != letter:
                result +=ch
        return result
    print(solution("banana", "a")) # "bnn" 이 출력
'''
