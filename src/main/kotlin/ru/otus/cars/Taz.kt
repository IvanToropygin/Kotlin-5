package ru.otus.cars

import ru.otus.cars.homework.PetrolMouth
import ru.otus.cars.homework.Tank
import ru.otus.cars.homework.TankMouth

object Taz: Car {
    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput
        get() = throw NotImplementedError("Приборов нет")

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    private val tank = object : Tank {
        override val mouth: TankMouth = PetrolMouth.create(this)
        override fun getContents(): Int = 0
        override fun receiveFuel(liters: Int) = throw IllegalStateException("Boom!")
    }
    override val tankMouth: TankMouth
        get() = tank.mouth

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }
}