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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInputMessageItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInputMessageItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineComponentsSchemasInputMessageItemPropertiesType() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputMessageItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputMessageItemPropertiesType = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputMessageItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputMessageItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputMessageItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputMessageItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
