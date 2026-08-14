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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/merged_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/merged_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestMergedByTypeX58b9285f) {
      encoder.encodeString(value.value)
    }
  }
}
