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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/3/properties/t
 * ype.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `signature_delta`.
   */
  public data object SignatureDelta : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType() {
    public override val `value`: String = "signature_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType = when (value) {
      SignatureDelta.value -> SignatureDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
