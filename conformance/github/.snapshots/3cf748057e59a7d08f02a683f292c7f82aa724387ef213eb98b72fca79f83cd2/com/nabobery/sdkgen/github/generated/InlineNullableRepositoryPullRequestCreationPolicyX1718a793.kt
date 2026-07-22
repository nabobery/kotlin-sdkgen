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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-repository/properties/pull_request_creation_policy
 */
@Serializable(with = InlineNullableRepositoryPullRequestCreationPolicyX1718a793.Serializer::class)
public sealed class InlineNullableRepositoryPullRequestCreationPolicyX1718a793 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineNullableRepositoryPullRequestCreationPolicyX1718a793() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineNullableRepositoryPullRequestCreationPolicyX1718a793() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryPullRequestCreationPolicyX1718a793()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryPullRequestCreationPolicyX1718a793 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineNullableRepositoryPullRequestCreationPolicyX1718a793> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableRepositoryPullRequestCreationPolicyX1718a793", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryPullRequestCreationPolicyX1718a793 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryPullRequestCreationPolicyX1718a793) {
      encoder.encodeString(value.value)
    }
  }
}
