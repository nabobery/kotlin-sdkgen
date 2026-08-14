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
 * Whether authorizations can be approved on this card. May be blocked from activating cards depending on past-due
 * Cardholder requirements. Defaults to `inactive`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/status
 */
@Serializable(with = InlineIssuingCardStatusXfe6e0a8e.Serializer::class)
public sealed class InlineIssuingCardStatusXfe6e0a8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineIssuingCardStatusXfe6e0a8e() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineIssuingCardStatusXfe6e0a8e() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineIssuingCardStatusXfe6e0a8e() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardStatusXfe6e0a8e()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardStatusXfe6e0a8e = when (value) {
      Active.value -> Active
      Canceled.value -> Canceled
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardStatusXfe6e0a8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardStatusXfe6e0a8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardStatusXfe6e0a8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardStatusXfe6e0a8e) {
      encoder.encodeString(value.value)
    }
  }
}
