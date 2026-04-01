def determine_color(s):
    col=ord(s[0]) - ord('a') + 1;
    row=int(s[1])

    if (row + col) % 2 == 0:
        return "Black"
    else:
        return "White" 
    """
    Write your logic here to determine the color based on the string s.
    Parameters:
        s (str): Input string representing a position.
    Returns:
        str: "Black" or "White" based on the problem statement.

    """
    pass

def main():
    import sys
    input = sys.stdin.read
    s = input().strip()  # Read the input string
    
    # Call the user logic function and print the output
    result = determine_color(s)
    print(result)

if __name__ == "__main__":
    main()
