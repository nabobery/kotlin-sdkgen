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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorResponse/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorResponse/properties/type
 */
@Serializable(with = InlineMessagesErrorResponseTypeX56dd5b56.Serializer::class)
public sealed class InlineMessagesErrorResponseTypeX56dd5b56 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineMessagesErrorResponseTypeX56dd5b56() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesErrorResponseTypeX56dd5b56()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesErrorResponseTypeX56dd5b56 = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesErrorResponseTypeX56dd5b56> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesErrorResponseTypeX56dd5b56", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesErrorResponseTypeX56dd5b56 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesErrorResponseTypeX56dd5b56) {
      encoder.encodeString(value.value)
    }
  }
}
