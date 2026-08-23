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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/base/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/base/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoOwnerTypeX4da8641d) {
      encoder.encodeString(value.value)
    }
  }
}
