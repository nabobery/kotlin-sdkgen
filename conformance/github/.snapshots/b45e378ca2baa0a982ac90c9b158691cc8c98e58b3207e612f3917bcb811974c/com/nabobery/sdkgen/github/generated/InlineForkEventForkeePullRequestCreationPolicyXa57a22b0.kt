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
 * sdkgen://source/openapi.yaml#/components/schemas/fork-event/properties/forkee/properties/pull_request_creation_policy
 */
@Serializable(with = InlineForkEventForkeePullRequestCreationPolicyXa57a22b0.Serializer::class)
public sealed class InlineForkEventForkeePullRequestCreationPolicyXa57a22b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineForkEventForkeePullRequestCreationPolicyXa57a22b0() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineForkEventForkeePullRequestCreationPolicyXa57a22b0() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineForkEventForkeePullRequestCreationPolicyXa57a22b0()

  public companion object {
    public fun fromValue(`value`: String): InlineForkEventForkeePullRequestCreationPolicyXa57a22b0 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineForkEventForkeePullRequestCreationPolicyXa57a22b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineForkEventForkeePullRequestCreationPolicyXa57a22b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineForkEventForkeePullRequestCreationPolicyXa57a22b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineForkEventForkeePullRequestCreationPolicyXa57a22b0) {
      encoder.encodeString(value.value)
    }
  }
}
