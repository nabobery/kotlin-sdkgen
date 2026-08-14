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
 * The status of the Checkout Session, one of `open`, `complete`, or `expired`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/status
 */
@Serializable(with = InlineCheckoutSessionStatusX6a7fc5ac.Serializer::class)
public sealed class InlineCheckoutSessionStatusX6a7fc5ac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineCheckoutSessionStatusX6a7fc5ac() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineCheckoutSessionStatusX6a7fc5ac() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineCheckoutSessionStatusX6a7fc5ac() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionStatusX6a7fc5ac()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionStatusX6a7fc5ac = when (value) {
      Complete.value -> Complete
      Expired.value -> Expired
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionStatusX6a7fc5ac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionStatusX6a7fc5ac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionStatusX6a7fc5ac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionStatusX6a7fc5ac) {
      encoder.encodeString(value.value)
    }
  }
}
