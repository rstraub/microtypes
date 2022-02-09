package nl.codecraftr.microtypes.microtype

@JvmInline
value class Weight(val grams: Int)

enum class Bean {
    ARABICA,
    ROBUSTA,
    BLEND
}

enum class Intensity {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE
}

data class Coffee(val type: Bean, val intensity: Intensity, val weight: Weight)
