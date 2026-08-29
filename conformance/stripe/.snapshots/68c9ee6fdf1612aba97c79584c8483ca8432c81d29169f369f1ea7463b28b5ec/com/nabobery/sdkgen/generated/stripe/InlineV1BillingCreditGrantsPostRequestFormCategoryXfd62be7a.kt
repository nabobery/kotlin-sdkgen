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
 * The category of this credit grant. It defaults to `paid` if not specified.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/category
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a.Serializer::class)
public sealed class InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `paid`.
   */
  public data object Paid : InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a() {
    public override val `value`: String = "paid"
  }

  /**
   * Documented value. Wire value: `promotional`.
   */
  public data object Promotional : InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a() {
    public override val `value`: String = "promotional"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a = when (value) {
      Paid.value -> Paid
      Promotional.value -> Promotional
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a) {
      encoder.encodeString(value.value)
    }
  }
}
