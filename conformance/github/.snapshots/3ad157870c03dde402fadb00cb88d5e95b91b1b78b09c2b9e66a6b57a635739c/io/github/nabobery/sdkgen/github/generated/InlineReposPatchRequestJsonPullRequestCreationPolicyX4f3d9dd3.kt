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
 * The policy that controls who can create pull requests for this repository: `all` or `collaborators_only`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/pull_request_creation_policy
 */
@Serializable(with = InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3.Serializer::class)
public sealed class InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3) {
      encoder.encodeString(value.value)
    }
  }
}
