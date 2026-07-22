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
 * sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/responses/200/content/application~1json/schema/properties/le
 * xical_fallback_reason/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/responses/200/content/application~1json/schema/properties/le
 * xical_fallback_reason/items
 */
@Serializable(with = InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6.Serializer::class)
public sealed class InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `no_text_terms`.
   */
  public data object NoTextTerms : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "no_text_terms"
  }

  /**
   * Documented value. Wire value: `quoted_text`.
   */
  public data object QuotedText : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "quoted_text"
  }

  /**
   * Documented value. Wire value: `non_issue_target`.
   */
  public data object NonIssueTarget : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "non_issue_target"
  }

  /**
   * Documented value. Wire value: `or_boolean_not_supported`.
   */
  public data object OrBooleanNotSupported : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "or_boolean_not_supported"
  }

  /**
   * Documented value. Wire value: `no_accessible_repos`.
   */
  public data object NoAccessibleRepos : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "no_accessible_repos"
  }

  /**
   * Documented value. Wire value: `server_error`.
   */
  public data object ServerError : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "server_error"
  }

  /**
   * Documented value. Wire value: `only_non_semantic_fields_requested`.
   */
  public data object OnlyNonSemanticFieldsRequested : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "only_non_semantic_fields_requested"
  }

  /**
   * Documented value. Wire value: `service_unavailable`.
   */
  public data object ServiceUnavailable : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6() {
    public override val `value`: String = "service_unavailable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6 = when (value) {
      NoTextTerms.value -> NoTextTerms
      QuotedText.value -> QuotedText
      NonIssueTarget.value -> NonIssueTarget
      OrBooleanNotSupported.value -> OrBooleanNotSupported
      NoAccessibleRepos.value -> NoAccessibleRepos
      ServerError.value -> ServerError
      OnlyNonSemanticFieldsRequested.value -> OnlyNonSemanticFieldsRequested
      ServiceUnavailable.value -> ServiceUnavailable
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6) {
      encoder.encodeString(value.value)
    }
  }
}
