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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/base/properties/repo/properties/p
 * ull_request_creation_policy
 */
@Serializable(with = InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44.Serializer::class)
public sealed class InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5BaseRepoPullRequestCreationPolicyXcf3d3f44) {
      encoder.encodeString(value.value)
    }
  }
}
