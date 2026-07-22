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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/reviewers/items/prope
 * rties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/reviewers/items/prope
 * rties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b) {
      encoder.encodeString(value.value)
    }
  }
}
