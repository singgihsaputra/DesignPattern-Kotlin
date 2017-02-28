package com.singgih.strategypattern

import com.singgih.strategypattern.characters.King
import com.singgih.strategypattern.characters.Knight
import com.singgih.strategypattern.characters.Queen
import com.singgih.strategypattern.characters.Troll
import com.singgih.strategypattern.weaponbehavior.AxeBehavior
import com.singgih.strategypattern.weaponbehavior.BowAndArrowBehavior
import com.singgih.strategypattern.weaponbehavior.KnifeBehavior
import com.singgih.strategypattern.weaponbehavior.SwordBehavior

/**
 * Created by singgihrs on 2/28/17.
 */
object Main {

    @JvmStatic fun main(args: Array<String>) {
        var character: Character = King()
        character.fight()
        character.performAttack()
        character.weaponBehavior = KnifeBehavior()
        character.performAttack()
        println()

        character = Queen()
        character.fight()
        character.performAttack()
        character.weaponBehavior = BowAndArrowBehavior()
        character.performAttack()
        println()

        character = Knight()
        character.fight()
        character.performAttack()
        character.weaponBehavior = SwordBehavior()
        character.performAttack()
        println()

        character = Troll()
        character.fight()
        character.performAttack()
        character.weaponBehavior = AxeBehavior()
        character.performAttack()
    }

}
