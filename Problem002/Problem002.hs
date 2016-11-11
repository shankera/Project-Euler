-- Version 1 --
main = print (sum (filter (\n -> n `mod` 2 == 0) (fibTill list)))
list = [1,2]
fibTill::[Int]->[Int]
fibTill list1
    | (last list1) > 3999999 = (init list1)
    | otherwise = fibTill (list1 ++ [(last list1) + (last (init list1))])
