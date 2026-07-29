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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-author-email-pattern/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-author-email-pattern/properties/type
 */
@Serializable(with = InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6.Serializer::class)
public sealed class InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commit_author_email_pattern`.
   */
  public data object CommitAuthorEmailPattern : InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6() {
    public override val `value`: String = "commit_author_email_pattern"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6 = when (value) {
      CommitAuthorEmailPattern.value -> CommitAuthorEmailPattern
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6) {
      encoder.encodeString(value.value)
    }
  }
}
