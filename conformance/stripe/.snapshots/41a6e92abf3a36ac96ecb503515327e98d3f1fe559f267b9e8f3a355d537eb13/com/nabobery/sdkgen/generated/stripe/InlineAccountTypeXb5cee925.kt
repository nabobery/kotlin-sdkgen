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
 * The Stripe account type. Can be `standard`, `express`, `custom`, or `none`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/type
 */
@Serializable(with = InlineAccountTypeXb5cee925.Serializer::class)
public sealed class InlineAccountTypeXb5cee925 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAccountTypeXb5cee925() {
    public override val `value`: String = "custom"
  }

  /**
   * Documented value. Wire value: `express`.
   */
  public data object Express : InlineAccountTypeXb5cee925() {
    public override val `value`: String = "express"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineAccountTypeXb5cee925() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineAccountTypeXb5cee925() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountTypeXb5cee925()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountTypeXb5cee925 = when (value) {
      Custom.value -> Custom
      Express.value -> Express
      None.value -> None
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountTypeXb5cee925> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountTypeXb5cee925", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountTypeXb5cee925 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountTypeXb5cee925) {
      encoder.encodeString(value.value)
    }
  }
}
