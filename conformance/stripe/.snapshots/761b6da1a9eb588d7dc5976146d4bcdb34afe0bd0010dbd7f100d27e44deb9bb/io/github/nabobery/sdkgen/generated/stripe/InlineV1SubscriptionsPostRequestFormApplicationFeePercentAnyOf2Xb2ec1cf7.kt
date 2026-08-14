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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/application_fee_percent/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/application_fee_percent/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2Xb2ec1cf7) {
      encoder.encodeString(value.value)
    }
  }
}
