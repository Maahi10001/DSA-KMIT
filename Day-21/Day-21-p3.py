def func(word, pattern, d, i=0, j=0):
 
    if not word or not pattern:
        return False
 
    n = len(word)
    m = len(pattern)
 
    if n < m:
        return False
    if i == n and j == m:
        return True
    if i == n or j == m:
        return False
    curr = pattern[j]
 
    if curr in d:
 
        s = d[curr]
        k = len(s)
 
        if i + k < len(word):
            ss = word[i:i + k]
        else:
            ss = word[i:]
 
        if ss != s:
            return False
 
        return func(word, pattern, d, i + k, j + 1)
 
    for k in range(1, n - i + 1):
 
        d[curr] = word[i:i + k]
 
        if func(word, pattern, d, i + k, j + 1):
            return True
 
        d.pop(curr)
 
    return False
 
 
if __name__== '__main__':
    
    pattern = input()
    word = input()
 
    d = {}
 
    if func(word, pattern, d):
        print("true")
    else:
        print("false")
