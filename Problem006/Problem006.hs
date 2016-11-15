main = print(squareOfSums(100) -  sumOfSquares(100))

squareOfSums::Int->Int
squareOfSums n = ((n * (n + 1)) `div` 2) * ((n * (n + 1)) `div` 2)

sumOfSquares::Int->Int
sumOfSquares n = (n * (n + 1) * ((2 * n) + 1) `div` 6)
