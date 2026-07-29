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
 * The networking status of the reader. We do not recommend using this field in flows that may block taking payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.reader/properties/status
 */
@Serializable(with = InlineTerminalReaderStatusX06729bfe.Serializer::class)
public sealed class InlineTerminalReaderStatusX06729bfe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineTerminalReaderStatusX06729bfe() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineTerminalReaderStatusX06729bfe() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalReaderStatusX06729bfe()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalReaderStatusX06729bfe = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderStatusX06729bfe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTerminalReaderStatusX06729bfe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalReaderStatusX06729bfe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderStatusX06729bfe) {
      encoder.encodeString(value.value)
    }
  }
}
