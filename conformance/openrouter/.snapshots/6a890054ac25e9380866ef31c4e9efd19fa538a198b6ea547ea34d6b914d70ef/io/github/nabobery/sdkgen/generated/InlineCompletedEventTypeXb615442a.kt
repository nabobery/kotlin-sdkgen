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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CompletedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CompletedEvent/properties/type
 */
@Serializable(with = InlineCompletedEventTypeXb615442a.Serializer::class)
public sealed class InlineCompletedEventTypeXb615442a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.completed`.
   */
  public data object ResponseCompleted : InlineCompletedEventTypeXb615442a() {
    public override val `value`: String = "response.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCompletedEventTypeXb615442a()

  public companion object {
    public fun fromValue(`value`: String): InlineCompletedEventTypeXb615442a = when (value) {
      ResponseCompleted.value -> ResponseCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCompletedEventTypeXb615442a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCompletedEventTypeXb615442a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCompletedEventTypeXb615442a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCompletedEventTypeXb615442a) {
      encoder.encodeString(value.value)
    }
  }
}
