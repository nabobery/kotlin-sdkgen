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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/a
 * uto_merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/a
 * uto_merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6.Serializer::class)
public sealed class InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestAutoMergeEnabledByTypeXa82e42f6) {
      encoder.encodeString(value.value)
    }
  }
}
