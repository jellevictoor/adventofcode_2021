package io.victoor.aco2021
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class Day6TestCase {
    @Test
    fun exampleTest(){
        val input = listOf(3,4,3,1,2).map{ Lanternfish(it) }
        val actual = SchoolSimulator(input,18).calculatePopulation()
        Assert.assertEquals(26,actual)
    }
    @Test
    fun exampleTest2(){
        val input = listOf(3,4,3,1,2).map{ Lanternfish(it) }
        val actual = SchoolSimulator(input,80).calculatePopulation()
        Assert.assertEquals(5934,actual)
    }
    @Test
    fun bigExample(){
        val input = listOf(3,4,3,1,2).map{ Lanternfish(it) }
        val actual = SchoolSimulator(input,256).calculatePopulation()
        Assert.assertEquals(26984457539L,actual)
    }
}