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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/minimal-repository/properties/pull_request_creation_policy
 */
@Serializable(with = InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3.Serializer::class)
public sealed class InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3()

  public companion object {
    public fun fromValue(`value`: String): InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3) {
      encoder.encodeString(value.value)
    }
  }
}
