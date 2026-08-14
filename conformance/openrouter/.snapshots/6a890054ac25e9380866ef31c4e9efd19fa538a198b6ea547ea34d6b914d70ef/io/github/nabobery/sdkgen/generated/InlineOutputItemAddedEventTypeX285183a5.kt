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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemAddedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemAddedEvent/properties/type
 */
@Serializable(with = InlineOutputItemAddedEventTypeX285183a5.Serializer::class)
public sealed class InlineOutputItemAddedEventTypeX285183a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_item.added`.
   */
  public data object ResponseOutputItemAdded : InlineOutputItemAddedEventTypeX285183a5() {
    public override val `value`: String = "response.output_item.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemAddedEventTypeX285183a5()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemAddedEventTypeX285183a5 = when (value) {
      ResponseOutputItemAdded.value -> ResponseOutputItemAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemAddedEventTypeX285183a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputItemAddedEventTypeX285183a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemAddedEventTypeX285183a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemAddedEventTypeX285183a5) {
      encoder.encodeString(value.value)
    }
  }
}
