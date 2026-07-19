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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputMessagePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineComponentsSchemasOutputMessagePropertiesType() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputMessagePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputMessagePropertiesType = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputMessagePropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
