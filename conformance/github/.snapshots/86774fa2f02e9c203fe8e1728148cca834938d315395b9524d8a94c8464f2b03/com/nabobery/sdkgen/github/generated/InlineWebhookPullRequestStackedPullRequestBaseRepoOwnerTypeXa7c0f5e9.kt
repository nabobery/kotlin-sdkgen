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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestBaseRepoOwnerTypeXa7c0f5e9) {
      encoder.encodeString(value.value)
    }
  }
}
