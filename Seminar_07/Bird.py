class Bird():

    def __init__(self):
        print('Птица готова')

    def who_is_this(self):
        print('Птица')

    def fly(self):
        print('Летает быстрее')


class Peng(Bird):

    def __init__(self):
        super().__init__()  # Обращение к конструктору родительского класса
        print('Пингвин готов')

    def who_is_this(self):
        print('Пингвин')

    def run(self):
        print('Бегает быстрее')


peng = Peng()
peng.who_is_this()
peng.fly()
peng.run()
