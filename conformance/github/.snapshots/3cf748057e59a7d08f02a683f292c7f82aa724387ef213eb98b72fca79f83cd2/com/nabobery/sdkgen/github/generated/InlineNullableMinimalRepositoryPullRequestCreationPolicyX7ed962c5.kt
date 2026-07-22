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
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-minimal-repository/properties/pull_request_creation_policy
 */
@Serializable(with = InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5.Serializer::class)
public sealed class InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableMinimalRepositoryPullRequestCreationPolicyX7ed962c5) {
      encoder.encodeString(value.value)
    }
  }
}
