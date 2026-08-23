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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/type
 */
@Serializable(with = InlineDebugEventTypeX9f7f544d.Serializer::class)
public sealed class InlineDebugEventTypeX9f7f544d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.debug`.
   */
  public data object ResponseDebug : InlineDebugEventTypeX9f7f544d() {
    public override val `value`: String = "response.debug"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDebugEventTypeX9f7f544d()

  public companion object {
    public fun fromValue(`value`: String): InlineDebugEventTypeX9f7f544d = when (value) {
      ResponseDebug.value -> ResponseDebug
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDebugEventTypeX9f7f544d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineDebugEventTypeX9f7f544d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDebugEventTypeX9f7f544d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDebugEventTypeX9f7f544d) {
      encoder.encodeString(value.value)
    }
  }
}
