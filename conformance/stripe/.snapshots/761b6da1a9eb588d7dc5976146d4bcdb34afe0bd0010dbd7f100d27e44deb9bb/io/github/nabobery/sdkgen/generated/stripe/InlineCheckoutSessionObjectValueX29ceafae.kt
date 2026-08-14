package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/object
 */
@Serializable(with = InlineCheckoutSessionObjectValueX29ceafae.Serializer::class)
public sealed class InlineCheckoutSessionObjectValueX29ceafae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checkout.session`.
   */
  public data object CheckoutSession : InlineCheckoutSessionObjectValueX29ceafae() {
    public override val `value`: String = "checkout.session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionObjectValueX29ceafae()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionObjectValueX29ceafae = when (value) {
      CheckoutSession.value -> CheckoutSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionObjectValueX29ceafae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionObjectValueX29ceafae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionObjectValueX29ceafae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionObjectValueX29ceafae) {
      encoder.encodeString(value.value)
    }
  }
}
