package co.tiagoaguiar.welcomepager

import androidx.annotation.DrawableRes

/**
 *
 * Agosto, 29 2019
 * @author suporte@moonjava.com.br (Tiago Aguiar).
 */
data class Tip(
    val title: String,
    val subtitle: String,
    @DrawableRes val logo: Int,
    @DrawableRes val background: Int
)