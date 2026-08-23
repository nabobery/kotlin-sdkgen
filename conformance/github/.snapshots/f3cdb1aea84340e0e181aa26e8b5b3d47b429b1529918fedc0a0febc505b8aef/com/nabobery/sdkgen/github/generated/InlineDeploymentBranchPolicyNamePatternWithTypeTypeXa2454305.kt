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
 * Whether this rule targets a branch or tag
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy-name-pattern-with-type/properties/type
 */
@Serializable(with = InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305.Serializer::class)
public sealed class InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305() {
    public override val `value`: String = "branch"
  }

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305() {
    public override val `value`: String = "tag"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305()

  public companion object {
    public fun fromValue(`value`: String): InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305 = when (value) {
      Branch.value -> Branch
      Tag.value -> Tag
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305) {
      encoder.encodeString(value.value)
    }
  }
}
