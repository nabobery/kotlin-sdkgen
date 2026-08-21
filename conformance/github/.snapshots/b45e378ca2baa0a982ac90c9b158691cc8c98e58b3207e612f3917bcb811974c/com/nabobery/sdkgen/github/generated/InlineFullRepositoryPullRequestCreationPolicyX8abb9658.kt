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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/full-repository/properties/pull_request_creation_policy
 */
@Serializable(with = InlineFullRepositoryPullRequestCreationPolicyX8abb9658.Serializer::class)
public sealed class InlineFullRepositoryPullRequestCreationPolicyX8abb9658 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineFullRepositoryPullRequestCreationPolicyX8abb9658() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineFullRepositoryPullRequestCreationPolicyX8abb9658() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFullRepositoryPullRequestCreationPolicyX8abb9658()

  public companion object {
    public fun fromValue(`value`: String): InlineFullRepositoryPullRequestCreationPolicyX8abb9658 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFullRepositoryPullRequestCreationPolicyX8abb9658> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineFullRepositoryPullRequestCreationPolicyX8abb9658", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFullRepositoryPullRequestCreationPolicyX8abb9658 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFullRepositoryPullRequestCreationPolicyX8abb9658) {
      encoder.encodeString(value.value)
    }
  }
}
