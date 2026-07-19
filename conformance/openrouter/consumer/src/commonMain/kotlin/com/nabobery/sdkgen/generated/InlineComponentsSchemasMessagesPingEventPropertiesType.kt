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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesPingEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesPingEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesPingEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ping`.
   */
  public data object Ping : InlineComponentsSchemasMessagesPingEventPropertiesType() {
    public override val `value`: String = "ping"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesPingEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesPingEventPropertiesType = when (value) {
      Ping.value -> Ping
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesPingEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesPingEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesPingEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesPingEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
