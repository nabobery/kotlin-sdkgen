package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseAnnotationAddedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseAnnotationAddedEvent/properties/type
 */
@Serializable(with = InlineBaseAnnotationAddedEventTypeXbc690cd8.Serializer::class)
public sealed class InlineBaseAnnotationAddedEventTypeXbc690cd8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_text.annotation.added`.
   */
  public data object ResponseOutputTextAnnotationAdded : InlineBaseAnnotationAddedEventTypeXbc690cd8() {
    public override val `value`: String = "response.output_text.annotation.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseAnnotationAddedEventTypeXbc690cd8()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseAnnotationAddedEventTypeXbc690cd8 = when (value) {
      ResponseOutputTextAnnotationAdded.value -> ResponseOutputTextAnnotationAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseAnnotationAddedEventTypeXbc690cd8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseAnnotationAddedEventTypeXbc690cd8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseAnnotationAddedEventTypeXbc690cd8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseAnnotationAddedEventTypeXbc690cd8) {
      encoder.encodeString(value.value)
    }
  }
}
