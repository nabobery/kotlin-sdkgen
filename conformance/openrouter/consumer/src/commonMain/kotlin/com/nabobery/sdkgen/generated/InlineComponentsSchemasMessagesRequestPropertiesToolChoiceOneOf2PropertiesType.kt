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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
