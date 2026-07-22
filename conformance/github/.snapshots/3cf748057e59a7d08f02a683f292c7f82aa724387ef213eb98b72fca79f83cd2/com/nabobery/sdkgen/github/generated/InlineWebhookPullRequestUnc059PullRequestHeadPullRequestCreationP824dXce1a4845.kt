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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/hea
 * d/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845.Serializer::class)
public sealed class InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnc059PullRequestHeadPullRequestCreationP824dXce1a4845) {
      encoder.encodeString(value.value)
    }
  }
}
