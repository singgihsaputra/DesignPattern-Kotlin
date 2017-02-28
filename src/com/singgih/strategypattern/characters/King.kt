package com.singgih.strategypattern.characters

import com.singgih.strategypattern.Character
import com.singgih.strategypattern.weaponbehavior.SwordBehavior

/**
 * Created by singgihrs on 2/28/17.
 */
class King : Character() {
    init {
        weaponBehavior = SwordBehavior()
    }

    override fun fight() {
        println("King attack in front line")
    }

}
