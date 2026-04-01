def find_youngest_member(n, m, gifts):
    score = [0]*(n+1)
    

    for a, b in gifts:
        score[a]-=1
        score[b]+=1

    for i in range(1, n+1):
        if score[i] == n-1:
            return i
    return -1
        
            

    
    """
    Write your logic here.
    Parameters:
        n (int): Number of family members
        m (int): Number of gifts exchanged
        gifts (list of tuples): List of tuples where each tuple contains two integers (a_i, b_i)
    Returns:
        int: The number that represents the youngest member of the family or -1 if no such member is found
    """
    pass


def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()
    
    n = int(data[0])  # Number of family members
    m = int(data[1])  # Number of gifts exchanged
    
    gifts = []
    index = 2
    for _ in range(m):
        a_i = int(data[index])
        b_i = int(data[index + 1])
        gifts.append((a_i, b_i))
        index += 2
    
    # Call user logic function and print the output
    result = find_youngest_member(n, m, gifts)
    print(result)

if __name__ == "__main__":
    main()
