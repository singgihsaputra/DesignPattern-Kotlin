package com.singgih.strategypattern.weaponbehavior

import com.singgih.strategypattern.WeaponBehavior

/**
 * Created by singgihrs on 2/28/17.
 */
class SwordBehavior : WeaponBehavior {

    override fun useWeapon() {
        println("Slash with sword!!!")
    }

}
