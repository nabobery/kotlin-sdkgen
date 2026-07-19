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
 */
@Serializable(with = InlineComponentsSchemasIncompleteDetailsPropertiesReason.Serializer::class)
public sealed class InlineComponentsSchemasIncompleteDetailsPropertiesReason {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_output_tokens`.
   */
  public data object MaxOutputTokens : InlineComponentsSchemasIncompleteDetailsPropertiesReason() {
    public override val `value`: String = "max_output_tokens"
  }

  /**
   * Documented value. Wire value: `content_filter`.
   */
  public data object ContentFilter : InlineComponentsSchemasIncompleteDetailsPropertiesReason() {
    public override val `value`: String = "content_filter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasIncompleteDetailsPropertiesReason()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasIncompleteDetailsPropertiesReason = when (value) {
      MaxOutputTokens.value -> MaxOutputTokens
      ContentFilter.value -> ContentFilter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasIncompleteDetailsPropertiesReason> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasIncompleteDetailsPropertiesReason", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasIncompleteDetailsPropertiesReason =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasIncompleteDetailsPropertiesReason) {
      encoder.encodeString(value.value)
    }
  }
}
