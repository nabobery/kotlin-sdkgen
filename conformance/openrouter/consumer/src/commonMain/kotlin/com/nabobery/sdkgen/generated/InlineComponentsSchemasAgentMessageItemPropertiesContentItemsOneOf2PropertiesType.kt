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
 * sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items/oneOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `encrypted_content`.
   */
  public data object EncryptedContent : InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType() {
    public override val `value`: String = "encrypted_content"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType = when (value) {
      EncryptedContent.value -> EncryptedContent
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
