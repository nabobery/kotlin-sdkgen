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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options/anyOf/0/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1{price}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/currency_options/anyOf/0/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e.Serializer::class)
public sealed class InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormCurrencyOptionsAnyOf1TaxBehaviorX4062ca0e) {
      encoder.encodeString(value.value)
    }
  }
}
