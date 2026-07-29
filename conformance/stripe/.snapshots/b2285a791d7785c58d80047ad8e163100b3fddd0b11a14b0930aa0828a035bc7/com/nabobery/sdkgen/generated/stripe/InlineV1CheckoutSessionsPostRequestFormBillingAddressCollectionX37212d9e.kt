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
 * Specify whether Checkout should collect the customer's billing address. Defaults to `auto`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/billing_address_collection
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e = when (value) {
      Auto.value -> Auto
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e) {
      encoder.encodeString(value.value)
    }
  }
}
