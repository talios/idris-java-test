module Main

mkGreeting      : String -> String
mkGreeting name = "Hello " ++ name ++ ", how are you?"

main : IO ()
main = print $ mkGreeting "Mark"
