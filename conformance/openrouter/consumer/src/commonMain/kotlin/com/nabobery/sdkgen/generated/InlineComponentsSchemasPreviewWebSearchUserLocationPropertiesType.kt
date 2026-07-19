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
 * sdkgen://source/openapi.yaml#/components/schemas/Preview_WebSearchUserLocation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType =
      when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasPreviewWebSearchUserLocationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
