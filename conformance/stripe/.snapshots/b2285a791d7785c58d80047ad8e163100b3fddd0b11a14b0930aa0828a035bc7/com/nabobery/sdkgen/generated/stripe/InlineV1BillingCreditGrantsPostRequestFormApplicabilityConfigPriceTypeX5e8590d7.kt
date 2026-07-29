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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config/properties/scope/properties/price_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/applicability_config/properties/scope/properties/price_type
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7.Serializer::class)
public sealed class InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `metered`.
   */
  public data object Metered : InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7() {
    public override val `value`: String = "metered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7 = when (value) {
      Metered.value -> Metered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigPriceTypeX5e8590d7) {
      encoder.encodeString(value.value)
    }
  }
}
