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
 * The toggle's default value. Can be `enabled` or `disabled`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_toggle/properties/default_value
 */
@Serializable(with = InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4 = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4) {
      encoder.encodeString(value.value)
    }
  }
}
