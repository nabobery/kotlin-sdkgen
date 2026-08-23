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
 * The reason for the state change. Ignored unless `state` is changed.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/state_reason
 */
@Serializable(with = InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab.Serializer::class)
public sealed class InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `not_planned`.
   */
  public data object NotPlanned : InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab() {
    public override val `value`: String = "not_planned"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab = when (value) {
      Completed.value -> Completed
      NotPlanned.value -> NotPlanned
      Duplicate.value -> Duplicate
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPatchRequestJsonStateReasonX2aea95ab) {
      encoder.encodeString(value.value)
    }
  }
}
