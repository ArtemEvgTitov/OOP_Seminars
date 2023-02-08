class Animal_PAR():

    def fly(self):
        print('Попугай умеет летать')

    def swim(self):
        print('Попугай не умеет плавать')


class Peng(Animal_PAR):

    def fly(self):
        print('Пингвин не умеет летать')

    def swim(self):
        print('Пингвин умеет плавать')


def fly_test(bird):
    bird.fly()


kesha = Animal_PAR()
ping = Peng()

fly_test(kesha)
fly_test(ping)
kesha.fly()
ping.fly()
