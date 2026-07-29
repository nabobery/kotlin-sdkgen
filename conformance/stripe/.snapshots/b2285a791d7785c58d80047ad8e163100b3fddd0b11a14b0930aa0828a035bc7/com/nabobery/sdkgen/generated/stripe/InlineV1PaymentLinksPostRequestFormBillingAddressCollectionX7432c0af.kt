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
 * Configuration for collecting the customer's billing address. Defaults to `auto`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/billing_address_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af = when (value) {
      Auto.value -> Auto
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af) {
      encoder.encodeString(value.value)
    }
  }
}
