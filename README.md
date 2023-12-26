# BMI  Calculator
>  Описание: В ходе данной работы был разработан **prototype**, позволяющий рисовать различные фигуры на полоте.
- Технологический стек: Java
- Статус: 2.1
- По сравнению с другими подобными продуктами, данная разработка отличается интуитивно понятным интерфейсом.

  **Скриншот рабочего окна приложения:**
  ----------------------------------------
![image](https://github.com/Brodyaga44/laba3/assets/145764043/a49c0838-e59b-422c-9e13-f8c5b498112c)


**Разбор части кода на примере класса SQUARE**
```
package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Square extends Shape implements Cloneable{
    public Square(Color color) {
        super(color);
    }
    @Override
    public void draw(GraphicsContext gc,MouseEvent mouseEvent) {
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(6.0);
        gc.strokeRect(mouseEvent.getX() - 52/2, mouseEvent.getY()- 52/2, 52, 52);
        gc.fillRect(mouseEvent.getX() - 52/2, mouseEvent.getY()- 52/2, 52, 52);
    }
    @Override
    public String toString() {
        return "КВАДРАТ";
    }

    @Override
    public Square clone() {
        return (Square) super.clone();
    }


}

```
------------------------
## Архитектура
> Диаграмма классов:

![prototype](https://github.com/Brodyaga44/laba3/assets/145764043/5c1c6b5f-7a7d-4d74-bfa6-e2ed3e0738a1)

## Завсимости
Для работы данного приложежния необходимы JavaFX и JDK 20.

## Установка
Не требуется. Достаточно запустить проект через любую доступную среду разработки JAVA.

##  Конфигурация
Не требуется

## Применение
> Для работы с ним требуется:
1. Выбрать нужную фигуру из списка
2. Выбрать цвет
3. Нажать на любом месте окна


## Проверка ПО
Не предусмотрена

## Проблемы
Плохой дизайн

## Получение справочной информации
По всем вопрсам можно обратиться в [телеграм](https://t.me/YaSimpleDimple) разработчика  

## Приглашение к сотрудничеству 
В дальнейшем предполагается передаботка действующего дизайна интерфейса

## Источники и справочники
- [Что такое Prototype?](https://ru.wikipedia.org/wiki/Прототип_(шаблон_проектирования))
- [Образовательная платформа Stepik](https://stepik.org/learn)

