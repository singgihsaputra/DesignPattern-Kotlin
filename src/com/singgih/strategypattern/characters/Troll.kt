package com.singgih.strategypattern.characters

import com.singgih.strategypattern.Character
import com.singgih.strategypattern.weaponbehavior.SwordBehavior

/**
 * Created by singgihrs on 2/28/17.
 */
class Troll : Character() {
    init {
        weaponBehavior = SwordBehavior()
    }

    override fun fight() {
        println("Troll attack in the Queen")
    }

}
