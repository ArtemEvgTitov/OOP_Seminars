class Comp():
    '''Документация'''

    def __init__(self):
        self.__max_price = 900  # Два нижних подчёркивания - это приватное поле

    def sell(self):  # Работает как Getter
        print(f'Цена продажи - {self.__max_price}')

    def set_max(self, price):  # Setter
        self.__max_price = price

    # def get_max(self):
    #     return self.__max_price


comp = Comp()
comp.sell()

# Цена не изменяется при обращении к полю
comp.__max_price = 1000
comp.sell()

# Цена изменяется при обращении к Setter'у
comp.set_max(2000)
comp.sell()
