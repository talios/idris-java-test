module Main

mkGreeting               : String -> Int -> String
mkGreeting name age = "Hello " ++ name ++ ", how are you?"

main : IO ()
main = print $ mkGreeting "Mark" 39
