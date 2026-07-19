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
 */
@Serializable(with = InlineComponentsSchemasDebugEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasDebugEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.debug`.
   */
  public data object ResponseDebug : InlineComponentsSchemasDebugEventPropertiesType() {
    public override val `value`: String = "response.debug"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasDebugEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasDebugEventPropertiesType = when (value) {
      ResponseDebug.value -> ResponseDebug
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasDebugEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasDebugEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasDebugEventPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasDebugEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
