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
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/1
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xc308f6ce) {
      encoder.encodeString(value.value)
    }
  }
}
