package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * A value indicating the Stripe dashboard this account has access to independent of the Connect application.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller_stripe_dashboard/properties/t
 * ype
 */
@Serializable(with = InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79.Serializer::class)
public sealed class InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `express`.
   */
  public data object Express : InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79() {
    public override val `value`: String = "express"
  }

  /**
   * Documented value. Wire value: `full`.
   */
  public data object Full : InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79() {
    public override val `value`: String = "full"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79 = when (value) {
      Express.value -> Express
      Full.value -> Full
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountUnificationAccountControllerStripeDashboardTypeXa60ddc79) {
      encoder.encodeString(value.value)
    }
  }
}
