package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/action
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedActionXb5371de2.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRequestedActionXb5371de2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookDeploymentReviewRequestedActionXb5371de2() {
    public override val `value`: String = "requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRequestedActionXb5371de2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRequestedActionXb5371de2 = when (value) {
      Requested.value -> Requested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedActionXb5371de2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRequestedActionXb5371de2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedActionXb5371de2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedActionXb5371de2) {
      encoder.encodeString(value.value)
    }
  }
}
