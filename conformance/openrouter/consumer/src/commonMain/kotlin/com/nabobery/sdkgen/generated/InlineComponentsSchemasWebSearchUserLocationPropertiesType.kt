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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasWebSearchUserLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasWebSearchUserLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineComponentsSchemasWebSearchUserLocationPropertiesType() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebSearchUserLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebSearchUserLocationPropertiesType = when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchUserLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebSearchUserLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchUserLocationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebSearchUserLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
