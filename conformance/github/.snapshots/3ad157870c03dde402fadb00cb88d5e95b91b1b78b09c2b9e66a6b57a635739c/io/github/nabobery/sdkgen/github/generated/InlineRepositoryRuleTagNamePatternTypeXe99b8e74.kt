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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-tag-name-pattern/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-tag-name-pattern/properties/type
 */
@Serializable(with = InlineRepositoryRuleTagNamePatternTypeXe99b8e74.Serializer::class)
public sealed class InlineRepositoryRuleTagNamePatternTypeXe99b8e74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tag_name_pattern`.
   */
  public data object TagNamePattern : InlineRepositoryRuleTagNamePatternTypeXe99b8e74() {
    public override val `value`: String = "tag_name_pattern"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleTagNamePatternTypeXe99b8e74()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleTagNamePatternTypeXe99b8e74 = when (value) {
      TagNamePattern.value -> TagNamePattern
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleTagNamePatternTypeXe99b8e74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleTagNamePatternTypeXe99b8e74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleTagNamePatternTypeXe99b8e74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleTagNamePatternTypeXe99b8e74) {
      encoder.encodeString(value.value)
    }
  }
}
