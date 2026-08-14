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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0/properties/brands_blocked/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0/properties/brands_blocked/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb) {
      encoder.encodeString(value.value)
    }
  }
}
