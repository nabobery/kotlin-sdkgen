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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent/properties/type
 */
@Serializable(with = InlineBaseContentPartAddedEventTypeXef1bd9f5.Serializer::class)
public sealed class InlineBaseContentPartAddedEventTypeXef1bd9f5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.content_part.added`.
   */
  public data object ResponseContentPartAdded : InlineBaseContentPartAddedEventTypeXef1bd9f5() {
    public override val `value`: String = "response.content_part.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseContentPartAddedEventTypeXef1bd9f5()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseContentPartAddedEventTypeXef1bd9f5 = when (value) {
      ResponseContentPartAdded.value -> ResponseContentPartAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseContentPartAddedEventTypeXef1bd9f5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseContentPartAddedEventTypeXef1bd9f5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseContentPartAddedEventTypeXef1bd9f5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseContentPartAddedEventTypeXef1bd9f5) {
      encoder.encodeString(value.value)
    }
  }
}
