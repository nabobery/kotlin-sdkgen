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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/fixed_amount
 * /properties/currency_options/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/fixed_amount
 * /properties/currency_options/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1TaxBehaviorX5fbea784) {
      encoder.encodeString(value.value)
    }
  }
}
