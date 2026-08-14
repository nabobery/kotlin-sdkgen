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
 * Whether this rule targets a branch or tag.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy/properties/type
 */
@Serializable(with = InlineDeploymentBranchPolicyTypeX41073575.Serializer::class)
public sealed class InlineDeploymentBranchPolicyTypeX41073575 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineDeploymentBranchPolicyTypeX41073575() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineDeploymentBranchPolicyTypeX41073575() {
    public override val `value`: String = "tag"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeploymentBranchPolicyTypeX41073575()

  public companion object {
    public fun fromValue(`value`: String): InlineDeploymentBranchPolicyTypeX41073575 = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeploymentBranchPolicyTypeX41073575> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDeploymentBranchPolicyTypeX41073575", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeploymentBranchPolicyTypeX41073575 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeploymentBranchPolicyTypeX41073575) {
      encoder.encodeString(value.value)
    }
  }
}
