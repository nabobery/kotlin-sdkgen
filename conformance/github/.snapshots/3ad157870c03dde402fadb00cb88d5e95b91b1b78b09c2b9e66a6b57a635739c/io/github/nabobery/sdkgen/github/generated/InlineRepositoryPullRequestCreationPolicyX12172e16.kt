package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository/properties/pull_request_creation_policy
 */
@Serializable(with = InlineRepositoryPullRequestCreationPolicyX12172e16.Serializer::class)
public sealed class InlineRepositoryPullRequestCreationPolicyX12172e16 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineRepositoryPullRequestCreationPolicyX12172e16() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineRepositoryPullRequestCreationPolicyX12172e16() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryPullRequestCreationPolicyX12172e16()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryPullRequestCreationPolicyX12172e16 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryPullRequestCreationPolicyX12172e16> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryPullRequestCreationPolicyX12172e16", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryPullRequestCreationPolicyX12172e16 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryPullRequestCreationPolicyX12172e16) {
      encoder.encodeString(value.value)
    }
  }
}
