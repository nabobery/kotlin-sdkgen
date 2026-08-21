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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers/get/parameters/7/schema
 */
@Serializable(with = InlineV1TerminalReadersGetParameterX71ea6570.Serializer::class)
public sealed class InlineV1TerminalReadersGetParameterX71ea6570 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineV1TerminalReadersGetParameterX71ea6570() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1TerminalReadersGetParameterX71ea6570() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersGetParameterX71ea6570()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersGetParameterX71ea6570 = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersGetParameterX71ea6570> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersGetParameterX71ea6570", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersGetParameterX71ea6570 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersGetParameterX71ea6570) {
      encoder.encodeString(value.value)
    }
  }
}
