package io.github.nabobery.sdkgen.github.generated

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
 * rties/reviewer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/reviewers/items/prope
 * rties/reviewer/properties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedReviewersItemReviewerTypeXbbdd5023) {
      encoder.encodeString(value.value)
    }
  }
}
