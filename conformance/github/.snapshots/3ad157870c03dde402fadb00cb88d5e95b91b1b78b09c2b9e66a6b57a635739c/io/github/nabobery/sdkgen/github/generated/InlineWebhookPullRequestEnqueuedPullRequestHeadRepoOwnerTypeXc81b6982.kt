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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/hea
 * d/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/hea
 * d/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982.Serializer::class)
public sealed class InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestHeadRepoOwnerTypeXc81b6982) {
      encoder.encodeString(value.value)
    }
  }
}
