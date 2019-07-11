package dev.herod.android.myktx.anim

import android.animation.AnimatorSet
import android.animation.ValueAnimator
import kotlin.math.abs

fun AnimatorSet.startReverse() {
    cancel()
    childAnimations.filterIsInstance<ValueAnimator>().forEach(ValueAnimator::reverse)
    interpolator = Interpolator { abs(it - 1f) }
    start()
}