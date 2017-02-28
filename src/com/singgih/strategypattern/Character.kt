package com.singgih.strategypattern

/**
 * Created by singgihrs on 2/28/17.
 */
abstract class Character {

    var weaponBehavior: WeaponBehavior? = null

    abstract fun fight()

    fun performAttack() {
        weaponBehavior?.useWeapon()
    }

}
