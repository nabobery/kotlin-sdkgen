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
 * Specifies whether to permit authorizations on this cardholder's cards.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/status
 */
@Serializable(with = InlineIssuingCardholderStatusX93ea3633.Serializer::class)
public sealed class InlineIssuingCardholderStatusX93ea3633 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineIssuingCardholderStatusX93ea3633() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `blocked`.
   */
  public data object Blocked : InlineIssuingCardholderStatusX93ea3633() {
    public override val `value`: String = "blocked"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineIssuingCardholderStatusX93ea3633() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderStatusX93ea3633()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderStatusX93ea3633 = when (value) {
      Active.value -> Active
      Blocked.value -> Blocked
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderStatusX93ea3633> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderStatusX93ea3633", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderStatusX93ea3633 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderStatusX93ea3633) {
      encoder.encodeString(value.value)
    }
  }
}
