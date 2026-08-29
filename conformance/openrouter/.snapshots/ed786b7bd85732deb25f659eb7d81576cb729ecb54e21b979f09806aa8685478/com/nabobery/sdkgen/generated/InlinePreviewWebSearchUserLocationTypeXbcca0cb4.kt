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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Preview_WebSearchUserLocation/properties/type
 */
@Serializable(with = InlinePreviewWebSearchUserLocationTypeXbcca0cb4.Serializer::class)
public sealed class InlinePreviewWebSearchUserLocationTypeXbcca0cb4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlinePreviewWebSearchUserLocationTypeXbcca0cb4() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePreviewWebSearchUserLocationTypeXbcca0cb4()

  public companion object {
    public fun fromValue(`value`: String): InlinePreviewWebSearchUserLocationTypeXbcca0cb4 = when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePreviewWebSearchUserLocationTypeXbcca0cb4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePreviewWebSearchUserLocationTypeXbcca0cb4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePreviewWebSearchUserLocationTypeXbcca0cb4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePreviewWebSearchUserLocationTypeXbcca0cb4) {
      encoder.encodeString(value.value)
    }
  }
}
