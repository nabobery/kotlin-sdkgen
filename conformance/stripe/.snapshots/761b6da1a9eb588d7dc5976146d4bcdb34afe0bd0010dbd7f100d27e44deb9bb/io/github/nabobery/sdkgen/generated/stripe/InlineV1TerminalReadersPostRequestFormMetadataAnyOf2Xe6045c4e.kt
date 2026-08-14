package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e.Serializer::class)
public sealed class InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersPostRequestFormMetadataAnyOf2Xe6045c4e) {
      encoder.encodeString(value.value)
    }
  }
}
