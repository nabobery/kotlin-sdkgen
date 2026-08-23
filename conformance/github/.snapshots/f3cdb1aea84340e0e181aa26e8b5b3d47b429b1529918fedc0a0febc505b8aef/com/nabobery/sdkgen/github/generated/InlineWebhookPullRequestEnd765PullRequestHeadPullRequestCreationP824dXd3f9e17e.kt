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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/hea
 * d/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e.Serializer::class)
public sealed class InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnd765PullRequestHeadPullRequestCreationP824dXd3f9e17e) {
      encoder.encodeString(value.value)
    }
  }
}
