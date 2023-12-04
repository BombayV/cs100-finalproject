class Main:
  def find_fibonacci_int(self, n):
    num1, num2, num3 = 0, 1, 0
    while True:
      num3 = num1 + num2
      num1 = num2
      num2 = num3
      if num3 == n:
        return True
      elif num3 > n:
        return False

  def find_largest_num_in_list(self, toFindList: list) -> int:
    largest_num = 0
    for num in toFindList:
      if num > largest_num:
        largest_num = num
    return largest_num

  def process_row_col(self, matrix: list[list[int]]) -> list[list[int]]:
    new_matrix = []
    for col in range(len(matrix[0])):
      new_row = []
      for row in range(len(matrix)):
        new_row.append(matrix[row][col])
      new_matrix.append(new_row)
    return new_matrix


if __name__ == "__main__":
  main: Main = Main()

  # Fibonacci
  toFindInt: int = 1
  toFindInt2: int = 0
  print(f"Fibonacci {toFindInt}: {main.find_fibonacci_int(toFindInt)}")
  print(f"Not Fibonacci {toFindInt2}: {main.find_fibonacci_int(toFindInt2)}")

  # Largest Number in List
  numList: list[int] = [1, 2, 3, 4, 5, 2, 4, 6, 1, 2, -1]
  print(f"Largest Number in List: {main.find_largest_num_in_list(numList)}")

  # Row and column processing
  matrix: list[list[int]] = [[1, 2, 3], [4, 5, 6]]
  print(f"Row and column processing: {main.process_row_col(matrix)}")
