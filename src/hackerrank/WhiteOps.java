package hackerrank;

public class WhiteOps {

}
// https://www.hackerrank.com/challenges/rectangular-game/editorial
//def countX(steps):
//    minr = sys.maxsize
//    minc = sys.maxsize
//    for s in steps:
//        cell = s.split()
//        if minr > int(cell[0]):
//            minr = int(cell[0])
//        if minc > int(cell[1]):
//            minc = int(cell[1])
//    return minr * minc


// Longest palindromic substring type
//def  palindrome(s):
//    palindromes = {}
//    n = len(s)
//    table = [[0 for i in range(len(s))] for j in range(len(s))]
//    for i in range(n):
//        table[i][i] = 1
//        palindromes[s[i]] = 0
//    for i in range(n-1):
//        if s[i] == s[i+1]:
//            table[i][i+1] = 1
//            palindromes[s[i:i+2]] = 1
//    for si in range(3, n+1):
//        for i in range(n-si+1):
//            j = si+i-1
//            if table[i+1][j-1] == 1 and s[i] == s[j]:
//                table[i][j] = 1
//                palindromes[s[i:j+1]] = 1
//    return len(palindromes)

// Smple hash
//def  verifyItems(origItems, origPrices, items, prices):
//    original_dict = {}
//    for i in range(len(origItems)):
//        original_dict[origItems[i]] = origPrices[i]
//    
//    count = 0
//    for i in range(len(items)):
//        if items[i] in original_dict and prices[i] != original_dict[items[i]]:
//            count+=1
//        
//    
//    return count