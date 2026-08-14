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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/head
 * /properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/head
 * /properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestHeadRepoOwnerTypeX94fabfc7) {
      encoder.encodeString(value.value)
    }
  }
}
