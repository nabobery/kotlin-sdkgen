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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CreatedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCreatedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCreatedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.created`.
   */
  public data object ResponseCreated : InlineComponentsSchemasCreatedEventPropertiesType() {
    public override val `value`: String = "response.created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCreatedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCreatedEventPropertiesType = when (value) {
      ResponseCreated.value -> ResponseCreated
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCreatedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCreatedEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCreatedEventPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCreatedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
