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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseErrorEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseErrorEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseErrorEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineComponentsSchemasBaseErrorEventPropertiesType() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseErrorEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseErrorEventPropertiesType = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseErrorEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseErrorEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseErrorEventPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseErrorEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
