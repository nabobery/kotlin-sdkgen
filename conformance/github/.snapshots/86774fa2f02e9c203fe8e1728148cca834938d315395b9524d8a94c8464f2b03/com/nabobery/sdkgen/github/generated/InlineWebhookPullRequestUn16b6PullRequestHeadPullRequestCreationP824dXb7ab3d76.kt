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
 * The policy controlling who can create pull requests: all or collaborators_only.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/h
 * ead/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76.Serializer::class)
public sealed class InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn16b6PullRequestHeadPullRequestCreationP824dXb7ab3d76) {
      encoder.encodeString(value.value)
    }
  }
}
