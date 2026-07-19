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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentText/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatContentTextPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatContentTextPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineComponentsSchemasChatContentTextPropertiesType() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatContentTextPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatContentTextPropertiesType = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentTextPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatContentTextPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentTextPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatContentTextPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
