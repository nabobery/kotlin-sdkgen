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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/base/
 * properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/base/
 * properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestBaseRepoOwnerTypeXd43d4fb0) {
      encoder.encodeString(value.value)
    }
  }
}
