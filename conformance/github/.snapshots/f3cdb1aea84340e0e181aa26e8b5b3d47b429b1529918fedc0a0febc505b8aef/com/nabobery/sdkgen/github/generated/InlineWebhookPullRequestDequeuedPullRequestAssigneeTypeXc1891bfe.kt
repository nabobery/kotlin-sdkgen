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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/ass
 * ignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/ass
 * ignee/properties/type
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestAssigneeTypeXc1891bfe) {
      encoder.encodeString(value.value)
    }
  }
}
