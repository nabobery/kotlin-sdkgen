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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/aut
 * o_merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/aut
 * o_merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestAutoMergeEnabledByTypeXafd28b59) {
      encoder.encodeString(value.value)
    }
  }
}
