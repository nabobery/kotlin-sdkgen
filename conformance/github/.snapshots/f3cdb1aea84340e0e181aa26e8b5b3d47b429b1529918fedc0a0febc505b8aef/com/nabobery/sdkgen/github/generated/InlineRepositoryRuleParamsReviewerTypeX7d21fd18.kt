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
 * The type of the reviewer
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-reviewer/properties/type
 */
@Serializable(with = InlineRepositoryRuleParamsReviewerTypeX7d21fd18.Serializer::class)
public sealed class InlineRepositoryRuleParamsReviewerTypeX7d21fd18 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineRepositoryRuleParamsReviewerTypeX7d21fd18() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleParamsReviewerTypeX7d21fd18()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleParamsReviewerTypeX7d21fd18 = when (value) {
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleParamsReviewerTypeX7d21fd18> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleParamsReviewerTypeX7d21fd18", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleParamsReviewerTypeX7d21fd18 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleParamsReviewerTypeX7d21fd18) {
      encoder.encodeString(value.value)
    }
  }
}
