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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorEvent/properties/type
 */
@Serializable(with = InlineMessagesErrorEventTypeX637de661.Serializer::class)
public sealed class InlineMessagesErrorEventTypeX637de661 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineMessagesErrorEventTypeX637de661() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesErrorEventTypeX637de661()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesErrorEventTypeX637de661 = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesErrorEventTypeX637de661> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesErrorEventTypeX637de661", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesErrorEventTypeX637de661 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesErrorEventTypeX637de661) {
      encoder.encodeString(value.value)
    }
  }
}
