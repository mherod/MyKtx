package dev.herod.android.myktx.anim

import android.animation.Animator
import android.animation.AnimatorSet

fun AnimatorSet.play(vararg animators: Animator) {
    animators.fold(play(animators.first()), AnimatorSet.Builder::with)
}
