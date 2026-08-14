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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestHeadRepoOwnerTypeX513cbaf7) {
      encoder.encodeString(value.value)
    }
  }
}
