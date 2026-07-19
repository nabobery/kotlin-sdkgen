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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/URLCitation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasUrlCitationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasUrlCitationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url_citation`.
   */
  public data object UrlCitation : InlineComponentsSchemasUrlCitationPropertiesType() {
    public override val `value`: String = "url_citation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasUrlCitationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasUrlCitationPropertiesType = when (value) {
      UrlCitation.value -> UrlCitation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUrlCitationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasUrlCitationPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUrlCitationPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUrlCitationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
