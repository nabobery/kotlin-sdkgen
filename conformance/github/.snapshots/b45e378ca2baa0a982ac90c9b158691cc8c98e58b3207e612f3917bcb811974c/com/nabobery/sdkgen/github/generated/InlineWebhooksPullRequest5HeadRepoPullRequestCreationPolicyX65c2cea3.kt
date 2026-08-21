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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/p
 * ull_request_creation_policy
 */
@Serializable(with = InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3.Serializer::class)
public sealed class InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5HeadRepoPullRequestCreationPolicyX65c2cea3) {
      encoder.encodeString(value.value)
    }
  }
}
