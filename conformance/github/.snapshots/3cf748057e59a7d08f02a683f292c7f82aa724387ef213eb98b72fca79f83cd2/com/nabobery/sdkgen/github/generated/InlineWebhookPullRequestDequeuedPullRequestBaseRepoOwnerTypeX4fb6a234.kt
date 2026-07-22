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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/bas
 * e/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/bas
 * e/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestBaseRepoOwnerTypeX4fb6a234) {
      encoder.encodeString(value.value)
    }
  }
}
