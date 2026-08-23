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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/auto_merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/auto_merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeEnabledByTypeX09bc3430) {
      encoder.encodeString(value.value)
    }
  }
}
