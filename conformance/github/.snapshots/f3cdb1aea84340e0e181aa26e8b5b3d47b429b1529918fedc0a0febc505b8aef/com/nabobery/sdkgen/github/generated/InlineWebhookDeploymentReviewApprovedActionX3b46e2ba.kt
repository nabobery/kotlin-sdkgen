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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/action
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedActionX3b46e2ba.Serializer::class)
public sealed class InlineWebhookDeploymentReviewApprovedActionX3b46e2ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineWebhookDeploymentReviewApprovedActionX3b46e2ba() {
    public override val `value`: String = "approved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewApprovedActionX3b46e2ba()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewApprovedActionX3b46e2ba = when (value) {
      Approved.value -> Approved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedActionX3b46e2ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewApprovedActionX3b46e2ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedActionX3b46e2ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedActionX3b46e2ba) {
      encoder.encodeString(value.value)
    }
  }
}
