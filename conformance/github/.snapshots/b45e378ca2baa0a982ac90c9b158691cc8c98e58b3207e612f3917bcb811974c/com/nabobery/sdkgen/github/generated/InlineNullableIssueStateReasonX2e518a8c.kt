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
 * The reason for the current state
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-issue/properties/state_reason
 */
@Serializable(with = InlineNullableIssueStateReasonX2e518a8c.Serializer::class)
public sealed class InlineNullableIssueStateReasonX2e518a8c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineNullableIssueStateReasonX2e518a8c() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineNullableIssueStateReasonX2e518a8c() {
    public override val `value`: String = "reopened"
  }

  /**
   * Documented value. Wire value: `not_planned`.
   */
  public data object NotPlanned : InlineNullableIssueStateReasonX2e518a8c() {
    public override val `value`: String = "not_planned"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineNullableIssueStateReasonX2e518a8c() {
    public override val `value`: String = "duplicate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableIssueStateReasonX2e518a8c()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableIssueStateReasonX2e518a8c = when (value) {
      Completed.value -> Completed
      Reopened.value -> Reopened
      NotPlanned.value -> NotPlanned
      Duplicate.value -> Duplicate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableIssueStateReasonX2e518a8c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableIssueStateReasonX2e518a8c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableIssueStateReasonX2e518a8c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableIssueStateReasonX2e518a8c) {
      encoder.encodeString(value.value)
    }
  }
}
