package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/IncompleteDetails/properties/reason.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/IncompleteDetails/properties/reason
 */
@Serializable(with = InlineIncompleteDetailsReasonXa92e2778.Serializer::class)
public sealed class InlineIncompleteDetailsReasonXa92e2778 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_output_tokens`.
   */
  public data object MaxOutputTokens : InlineIncompleteDetailsReasonXa92e2778() {
    public override val `value`: String = "max_output_tokens"
  }

  /**
   * Documented value. Wire value: `content_filter`.
   */
  public data object ContentFilter : InlineIncompleteDetailsReasonXa92e2778() {
    public override val `value`: String = "content_filter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIncompleteDetailsReasonXa92e2778()

  public companion object {
    public fun fromValue(`value`: String): InlineIncompleteDetailsReasonXa92e2778 = when (value) {
      MaxOutputTokens.value -> MaxOutputTokens
      ContentFilter.value -> ContentFilter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIncompleteDetailsReasonXa92e2778> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineIncompleteDetailsReasonXa92e2778", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIncompleteDetailsReasonXa92e2778 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIncompleteDetailsReasonXa92e2778) {
      encoder.encodeString(value.value)
    }
  }
}
