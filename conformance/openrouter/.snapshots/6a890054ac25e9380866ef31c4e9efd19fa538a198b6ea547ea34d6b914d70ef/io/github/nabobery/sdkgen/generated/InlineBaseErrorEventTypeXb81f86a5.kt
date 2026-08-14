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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseErrorEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseErrorEvent/properties/type
 */
@Serializable(with = InlineBaseErrorEventTypeXb81f86a5.Serializer::class)
public sealed class InlineBaseErrorEventTypeXb81f86a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineBaseErrorEventTypeXb81f86a5() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseErrorEventTypeXb81f86a5()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseErrorEventTypeXb81f86a5 = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseErrorEventTypeXb81f86a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseErrorEventTypeXb81f86a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseErrorEventTypeXb81f86a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseErrorEventTypeXb81f86a5) {
      encoder.encodeString(value.value)
    }
  }
}
