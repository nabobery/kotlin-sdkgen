package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_terminal.reader/properties/object
 */
@Serializable(with = InlineDeletedTerminalReaderObjectValueX92c90936.Serializer::class)
public sealed class InlineDeletedTerminalReaderObjectValueX92c90936 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.reader`.
   */
  public data object TerminalReader : InlineDeletedTerminalReaderObjectValueX92c90936() {
    public override val `value`: String = "terminal.reader"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedTerminalReaderObjectValueX92c90936()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedTerminalReaderObjectValueX92c90936 = when (value) {
      TerminalReader.value -> TerminalReader
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeletedTerminalReaderObjectValueX92c90936> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedTerminalReaderObjectValueX92c90936", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedTerminalReaderObjectValueX92c90936 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedTerminalReaderObjectValueX92c90936) {
      encoder.encodeString(value.value)
    }
  }
}
