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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/auto_
 * merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/auto_
 * merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestAutoMergeEnabledByTypeX4ecf083e) {
      encoder.encodeString(value.value)
    }
  }
}
