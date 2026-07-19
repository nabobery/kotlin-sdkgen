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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/IncompleteEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasIncompleteEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasIncompleteEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.incomplete`.
   */
  public data object ResponseIncomplete : InlineComponentsSchemasIncompleteEventPropertiesType() {
    public override val `value`: String = "response.incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasIncompleteEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasIncompleteEventPropertiesType = when (value) {
      ResponseIncomplete.value -> ResponseIncomplete
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasIncompleteEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasIncompleteEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasIncompleteEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasIncompleteEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
