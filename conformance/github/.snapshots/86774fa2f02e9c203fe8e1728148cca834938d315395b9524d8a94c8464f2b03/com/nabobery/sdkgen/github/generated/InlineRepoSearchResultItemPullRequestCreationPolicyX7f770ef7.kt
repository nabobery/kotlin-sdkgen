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
 * sdkgen://source/openapi.yaml#/components/schemas/repo-search-result-item/properties/pull_request_creation_policy
 */
@Serializable(with = InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7.Serializer::class)
public sealed class InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7()

  public companion object {
    public fun fromValue(`value`: String): InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepoSearchResultItemPullRequestCreationPolicyX7f770ef7) {
      encoder.encodeString(value.value)
    }
  }
}
