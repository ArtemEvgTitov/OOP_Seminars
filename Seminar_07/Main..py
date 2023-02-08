class Point ():
    x = 10
    y = 20
    z = 30

    def sqrt_x(self, x):
        return x*x

    @staticmethod  # Статический метод
    def hello():
        print('Привет')

    # @classmethod
    def hello_class(cls):
        print(f'Hello class {cls.__name__}')  # Ссылается на наш класс Point


point = Point()

print(point.x, point.y, point.z)
print(point.sqrt_x(6))
point.hello()
Point.hello()
Point.hello_class()
