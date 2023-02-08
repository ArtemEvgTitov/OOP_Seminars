class Pirrot():
    # Атрибут класса
    spec = "Птица"

    # Конструктор
    def __init__(self, name, age):
        self.name = name
        self.age = age


# Создаём экземпляр класса
kesha = Pirrot("Кеша", 10)
zhorik = Pirrot("Жора", 15)

# Получаем доступ к атрибутам класса
print(f"Кеша - {kesha.__class__.spec}")
print(f"Жорик - {zhorik.__class__.spec}")

# Получаем доступ к атрибутам экземпляра класса
print(f'Мой попугай {kesha.name}, ему {kesha.age} лет')
print(f'Попугай друга {zhorik.name}, ему {zhorik.age} лет')
