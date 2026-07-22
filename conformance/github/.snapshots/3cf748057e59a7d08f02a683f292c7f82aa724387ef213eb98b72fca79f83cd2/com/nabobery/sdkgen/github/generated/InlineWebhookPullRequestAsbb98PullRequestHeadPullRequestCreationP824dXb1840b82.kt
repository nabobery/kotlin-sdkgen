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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/hea
 * d/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82.Serializer::class)
public sealed class InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAsbb98PullRequestHeadPullRequestCreationP824dXb1840b82) {
      encoder.encodeString(value.value)
    }
  }
}
