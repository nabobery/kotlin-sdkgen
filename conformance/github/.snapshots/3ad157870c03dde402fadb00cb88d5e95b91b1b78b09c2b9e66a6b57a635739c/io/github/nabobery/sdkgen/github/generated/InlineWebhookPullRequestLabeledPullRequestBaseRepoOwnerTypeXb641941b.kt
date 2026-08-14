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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/base
 * /properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/base
 * /properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b.Serializer::class)
public sealed class InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestBaseRepoOwnerTypeXb641941b) {
      encoder.encodeString(value.value)
    }
  }
}
