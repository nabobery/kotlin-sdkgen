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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-message-pattern/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-message-pattern/properties/type
 */
@Serializable(with = InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f.Serializer::class)
public sealed class InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commit_message_pattern`.
   */
  public data object CommitMessagePattern : InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f() {
    public override val `value`: String = "commit_message_pattern"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f = when (value) {
      CommitMessagePattern.value -> CommitMessagePattern
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f) {
      encoder.encodeString(value.value)
    }
  }
}
