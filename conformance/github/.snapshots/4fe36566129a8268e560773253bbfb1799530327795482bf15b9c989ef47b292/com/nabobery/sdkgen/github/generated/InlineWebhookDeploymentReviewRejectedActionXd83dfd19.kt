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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/action
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedActionXd83dfd19.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRejectedActionXd83dfd19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineWebhookDeploymentReviewRejectedActionXd83dfd19() {
    public override val `value`: String = "rejected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRejectedActionXd83dfd19()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRejectedActionXd83dfd19 = when (value) {
      Rejected.value -> Rejected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedActionXd83dfd19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRejectedActionXd83dfd19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedActionXd83dfd19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedActionXd83dfd19) {
      encoder.encodeString(value.value)
    }
  }
}
