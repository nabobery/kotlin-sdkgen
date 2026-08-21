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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-branch-name-pattern/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-branch-name-pattern/properties/type
 */
@Serializable(with = InlineRepositoryRuleBranchNamePatternTypeX1f68907f.Serializer::class)
public sealed class InlineRepositoryRuleBranchNamePatternTypeX1f68907f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch_name_pattern`.
   */
  public data object BranchNamePattern : InlineRepositoryRuleBranchNamePatternTypeX1f68907f() {
    public override val `value`: String = "branch_name_pattern"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleBranchNamePatternTypeX1f68907f()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleBranchNamePatternTypeX1f68907f = when (value) {
      BranchNamePattern.value -> BranchNamePattern
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleBranchNamePatternTypeX1f68907f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleBranchNamePatternTypeX1f68907f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleBranchNamePatternTypeX1f68907f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleBranchNamePatternTypeX1f68907f) {
      encoder.encodeString(value.value)
    }
  }
}
