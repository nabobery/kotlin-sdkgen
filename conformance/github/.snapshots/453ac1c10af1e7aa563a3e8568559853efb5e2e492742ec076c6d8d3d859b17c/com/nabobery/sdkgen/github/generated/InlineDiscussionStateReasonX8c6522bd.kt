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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/discussion/properties/state_reason
 */
@Serializable(with = InlineDiscussionStateReasonX8c6522bd.Serializer::class)
public sealed class InlineDiscussionStateReasonX8c6522bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineDiscussionStateReasonX8c6522bd() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `outdated`.
   */
  public data object Outdated : InlineDiscussionStateReasonX8c6522bd() {
    public override val `value`: String = "outdated"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineDiscussionStateReasonX8c6522bd() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineDiscussionStateReasonX8c6522bd() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiscussionStateReasonX8c6522bd()

  public companion object {
    public fun fromValue(`value`: String): InlineDiscussionStateReasonX8c6522bd = when (value) {
      Resolved.value -> Resolved
      Outdated.value -> Outdated
      Duplicate.value -> Duplicate
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDiscussionStateReasonX8c6522bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDiscussionStateReasonX8c6522bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiscussionStateReasonX8c6522bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiscussionStateReasonX8c6522bd) {
      encoder.encodeString(value.value)
    }
  }
}
