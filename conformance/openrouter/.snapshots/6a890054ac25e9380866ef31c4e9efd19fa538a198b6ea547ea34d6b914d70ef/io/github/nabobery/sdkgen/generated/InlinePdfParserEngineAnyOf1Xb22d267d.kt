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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PDFParserEngine/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PDFParserEngine/anyOf/0
 */
@Serializable(with = InlinePdfParserEngineAnyOf1Xb22d267d.Serializer::class)
public sealed class InlinePdfParserEngineAnyOf1Xb22d267d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mistral-ocr`.
   */
  public data object MistralOcr : InlinePdfParserEngineAnyOf1Xb22d267d() {
    public override val `value`: String = "mistral-ocr"
  }

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : InlinePdfParserEngineAnyOf1Xb22d267d() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `cloudflare-ai`.
   */
  public data object CloudflareAi : InlinePdfParserEngineAnyOf1Xb22d267d() {
    public override val `value`: String = "cloudflare-ai"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePdfParserEngineAnyOf1Xb22d267d()

  public companion object {
    public fun fromValue(`value`: String): InlinePdfParserEngineAnyOf1Xb22d267d = when (value) {
      MistralOcr.value -> MistralOcr
      Native.value -> Native
      CloudflareAi.value -> CloudflareAi
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePdfParserEngineAnyOf1Xb22d267d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlinePdfParserEngineAnyOf1Xb22d267d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePdfParserEngineAnyOf1Xb22d267d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePdfParserEngineAnyOf1Xb22d267d) {
      encoder.encodeString(value.value)
    }
  }
}
