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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/preferred_locales/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/preferred_locales/items
 */
@Serializable(with = InlineIssuingCardholderPreferredLocalesItemXdb230b01.Serializer::class)
public sealed class InlineIssuingCardholderPreferredLocalesItemXdb230b01 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineIssuingCardholderPreferredLocalesItemXdb230b01() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineIssuingCardholderPreferredLocalesItemXdb230b01() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `es`.
   */
  public data object Es : InlineIssuingCardholderPreferredLocalesItemXdb230b01() {
    public override val `value`: String = "es"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineIssuingCardholderPreferredLocalesItemXdb230b01() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `it`.
   */
  public data object It : InlineIssuingCardholderPreferredLocalesItemXdb230b01() {
    public override val `value`: String = "it"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderPreferredLocalesItemXdb230b01()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderPreferredLocalesItemXdb230b01 = when (value) {
      De.value -> De
      En.value -> En
      Es.value -> Es
      Fr.value -> Fr
      It.value -> It
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderPreferredLocalesItemXdb230b01> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderPreferredLocalesItemXdb230b01", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderPreferredLocalesItemXdb230b01 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderPreferredLocalesItemXdb230b01) {
      encoder.encodeString(value.value)
    }
  }
}
