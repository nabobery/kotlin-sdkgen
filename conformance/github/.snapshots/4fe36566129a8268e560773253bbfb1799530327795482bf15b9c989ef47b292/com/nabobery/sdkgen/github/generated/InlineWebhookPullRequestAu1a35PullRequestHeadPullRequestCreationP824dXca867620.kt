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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/head/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620.Serializer::class)
public sealed class InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu1a35PullRequestHeadPullRequestCreationP824dXca867620) {
      encoder.encodeString(value.value)
    }
  }
}
