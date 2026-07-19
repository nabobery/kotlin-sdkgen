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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatResult/properties/object.
 */
@Serializable(with = InlineComponentsSchemasChatResultPropertiesObject.Serializer::class)
public sealed class InlineComponentsSchemasChatResultPropertiesObject {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `chat.completion`.
   */
  public data object ChatCompletion : InlineComponentsSchemasChatResultPropertiesObject() {
    public override val `value`: String = "chat.completion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatResultPropertiesObject()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatResultPropertiesObject = when (value) {
      ChatCompletion.value -> ChatCompletion
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatResultPropertiesObject> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatResultPropertiesObject",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatResultPropertiesObject = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatResultPropertiesObject) {
      encoder.encodeString(value.value)
    }
  }
}
