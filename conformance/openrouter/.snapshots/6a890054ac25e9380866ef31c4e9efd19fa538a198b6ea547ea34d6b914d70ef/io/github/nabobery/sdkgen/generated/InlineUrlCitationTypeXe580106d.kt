package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/URLCitation/properties/type
 */
@Serializable(with = InlineUrlCitationTypeXe580106d.Serializer::class)
public sealed class InlineUrlCitationTypeXe580106d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url_citation`.
   */
  public data object UrlCitation : InlineUrlCitationTypeXe580106d() {
    public override val `value`: String = "url_citation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUrlCitationTypeXe580106d()

  public companion object {
    public fun fromValue(`value`: String): InlineUrlCitationTypeXe580106d = when (value) {
      UrlCitation.value -> UrlCitation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUrlCitationTypeXe580106d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineUrlCitationTypeXe580106d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUrlCitationTypeXe580106d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUrlCitationTypeXe580106d) {
      encoder.encodeString(value.value)
    }
  }
}
