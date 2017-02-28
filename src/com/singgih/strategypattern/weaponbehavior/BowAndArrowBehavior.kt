package com.singgih.strategypattern.weaponbehavior

import com.singgih.strategypattern.WeaponBehavior

/**
 * Created by singgihrs on 2/28/17.
 */
class BowAndArrowBehavior : WeaponBehavior {

    override fun useWeapon() {
        println("Shoot with arrow!!!")
    }

}
