module Main

mkGreeting               : String -> Int -> String
mkGreeting name age = if age < 20 then "Hello " ++ name ++ ", how are you?" else "Yo! Wazzup " ++ name

main : IO ()
main = print $ mkGreeting "Mark" 39
