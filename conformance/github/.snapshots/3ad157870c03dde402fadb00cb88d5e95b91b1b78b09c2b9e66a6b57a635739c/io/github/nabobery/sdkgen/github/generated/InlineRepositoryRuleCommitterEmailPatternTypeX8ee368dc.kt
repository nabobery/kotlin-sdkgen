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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-committer-email-pattern/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-committer-email-pattern/properties/type
 */
@Serializable(with = InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc.Serializer::class)
public sealed class InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `committer_email_pattern`.
   */
  public data object CommitterEmailPattern : InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc() {
    public override val `value`: String = "committer_email_pattern"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc = when (value) {
      CommitterEmailPattern.value -> CommitterEmailPattern
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc) {
      encoder.encodeString(value.value)
    }
  }
}
