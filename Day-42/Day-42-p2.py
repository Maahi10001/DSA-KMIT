'''
Rakesh is playing a game with two arrays called  array1 and array2 of single digit numbers of range 1 to 6.
In each step rakesh can change any value of any array in range of 1 to 6. 
return the minimum number of steps to make the sum of values in array1 equal to sum of values in array2
otherwise print -1, if it is not possible to make the sum of two arrays equal

Note:  array1 and array2 possibly of different lengths.

input =6
1 2 3 4 5 6
6
1 1 2 2 2 2
output =3


Rakesh can make  the sums of array1 and array2 equal with 3 operations.
- Change array2[0] to 6. array1 = [1,2,3,4,5,6], array2 = [6,1,2,2,2,2].
- Change array1[5] to 1. array1 = [1,2,3,4,5,1], array2 = [6,1,2,2,2,2].
- Change array1[2] to 2. array1 = [1,2,2,4,5,1], array2 = [6,1,2,2,2,2].


input =7
1 1 1 1 1 1 1
1
6
output =-1
Explanation: There is no way to decrease the sum of array1 or to increase the sum of array2 to make them equal.so return -1.


input =2
6 6
1
1
output =3
Explanation: You can make the sums of array1 and array2 equal with 3 operations. All indices are 0-indexed. 
- Change array1[0] to 2. array1 = [2,6], array2 = [1].
- Change array1[1] to 2. array1 = [2,2], array2 = [1].
- Change array2[0] to 4. array1 = [2,2], array2 = [4].


'''
#solution
def getmin(nums1,nums2,n1,n2):
    if 6*n1 < n2 or 6*n2 < n1: return -1 # impossible 
    
    if sum(nums1) < sum(nums2): nums1, nums2 = nums2, nums1
    s1, s2 = sum(nums1), sum(nums2) # s1 >= s2
        
    nums1.sort()
    nums2.sort()
    
    ans = j = 0
    i = n1-1
    
    while s1 > s2: 
        if j >= n2 or 0 <= i and nums1[i] - 1 > 6 - nums2[j]: 
            s1 += 1 - nums1[i]
            i -= 1
        else: 
            s2 += 6 - nums2[j]
            j += 1
        ans += 1
    return ans 
    
if __name__=="__main__":
    n1=int(input())
    l1=list(map(int,input().split()))
    n2=int(input())
    l2=list(map(int,input().split()))
    print(getmin(l1,l2,n1,n2))