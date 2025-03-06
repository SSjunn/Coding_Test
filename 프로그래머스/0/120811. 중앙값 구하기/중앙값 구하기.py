def solution(array):
    array.sort() #오름차순정리
    return array[len(array)//2]