package com.example.segundodia.tax

data class IsrBracket(
    val lowerLimitInclusive: Double,
    val upperLimitInclusive: Double?,
    val fixedFee: Double,
    val rate: Double
)

object IsrCalculator {
    private val monthlyBrackets: List<IsrBracket> = listOf(
        IsrBracket(lowerLimitInclusive = 0.0, upperLimitInclusive = 6440.23, fixedFee = 0.0, rate = 0.0192),
        IsrBracket(lowerLimitInclusive = 6440.24, upperLimitInclusive = 54782.17, fixedFee = 123.55, rate = 0.0640),
        IsrBracket(lowerLimitInclusive = 54782.18, upperLimitInclusive = 96137.67, fixedFee = 3210.46, rate = 0.1088),
        IsrBracket(lowerLimitInclusive = 96137.68, upperLimitInclusive = 111505.24, fixedFee = 7725.09, rate = 0.1600),
        IsrBracket(lowerLimitInclusive = 111505.25, upperLimitInclusive = 269988.50, fixedFee = 10276.86, rate = 0.1792),
        IsrBracket(lowerLimitInclusive = 269988.51, upperLimitInclusive = null, fixedFee = 14190.78, rate = 0.2136)
    )

    fun calculateMonthlyIsr(grossMonthlySalary: Double): Double {
        if (grossMonthlySalary <= 0.0) return 0.0
        val bracket = monthlyBrackets.firstOrNull { b ->
            val upperOk = b.upperLimitInclusive?.let { grossMonthlySalary <= it } ?: true
            grossMonthlySalary >= b.lowerLimitInclusive && upperOk
        } ?: monthlyBrackets.last()
        val excess = grossMonthlySalary - bracket.lowerLimitInclusive
        val variableFee = excess * bracket.rate
        val totalIsr = bracket.fixedFee + variableFee
        return if (totalIsr < 0.0) 0.0 else totalIsr
    }

    fun calculateMonthlyNet(grossMonthlySalary: Double): Double {
        val isr = calculateMonthlyIsr(grossMonthlySalary)
        val net = grossMonthlySalary - isr
        return if (net < 0.0) 0.0 else net
    }
}


