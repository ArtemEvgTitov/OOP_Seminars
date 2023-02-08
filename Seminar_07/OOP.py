class Horse():
    is_horse = True

class Donkey(): # Наследование указывается в скобках
    is_donkey = True

class Mulle(Horse, Donkey): # Множественное наследование есть только в Python
    pass

mull = Mulle()

print(mull.is_donkey)
print(mull.is_horse)