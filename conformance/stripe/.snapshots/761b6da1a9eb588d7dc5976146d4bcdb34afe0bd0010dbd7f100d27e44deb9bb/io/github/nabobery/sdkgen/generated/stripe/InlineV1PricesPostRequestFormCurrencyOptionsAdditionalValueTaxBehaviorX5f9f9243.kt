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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/currency_options/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243.Serializer::class)
public sealed class InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTaxBehaviorX5f9f9243) {
      encoder.encodeString(value.value)
    }
  }
}
