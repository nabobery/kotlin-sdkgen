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
 * rlencoded/schema/properties/subscription_details/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `classic`.
   */
  public data object Classic : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392() {
    public override val `value`: String = "classic"
  }

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392 = when (value) {
      Classic.value -> Classic
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXb11c3392) {
      encoder.encodeString(value.value)
    }
  }
}
