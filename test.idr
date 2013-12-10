module Main

data Party = Person String Int

mkGreeting                   : Party -> String
mkGreeting (Person name age) = if age > 20 then
                                 "Hello " ++ name ++ ", how are you?"
                               else
                                 "Yo! Wazzup " ++ name

main : IO ()
main = print $ mkGreeting $ Person "Mark" 39
