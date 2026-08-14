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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/bill_until/pro
 * perties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/bill_until/pro
 * perties/type
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `duration`.
   */
  public data object Duration : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917() {
    public override val `value`: String = "duration"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917 = when (value) {
      Duration.value -> Duration
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeX73616917) {
      encoder.encodeString(value.value)
    }
  }
}
