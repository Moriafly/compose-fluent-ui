package io.github.composefluent.background

import androidx.compose.ui.InternalComposeUiApi
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.skiaPaint
import org.jetbrains.skia.FilterBlurMode
import org.jetbrains.skia.MaskFilter

@OptIn(InternalComposeUiApi::class)
internal actual fun Paint.applyShadowMaskFilter(radius: Float) {
    skiaPaint.maskFilter = MaskFilter.makeBlur(
        mode = FilterBlurMode.NORMAL,
        sigma = BlurEffect.convertRadiusToSigma(radius)
    )
}

internal actual fun supportFluentElevation(): Boolean {
    return true
}