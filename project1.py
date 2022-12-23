import random

def swg(computer,you):
    if computer==you:
        return None
    elif computer=="s":
        if you=="w":
         return False
        elif you =="g":
            return True

    elif computer =="w" :
        if you == "s" :
            return True
        elif you =="g":
            return False  
    elif computer =="g"  :
        if you =="s" :
            return False
        elif you=="w":
            return True
print("Computer turn : snake(s) water(w) gun(g)")            
randNo = random.randint(1,3) 
if randNo==1:
    computer="s" 
elif randNo==2:
    computer="w"
elif randNo ==3:
    computer ="g"
you =input("your turn : snake(s) water(w) gun(g)? ")
a = swg(computer,you)
if a==None:
    print(" this game is a tie"  ) 
elif a:
    print("you win")  
else :
    print("you loose")
