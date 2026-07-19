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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PDFParserEngine/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasPdfParserEngineAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasPdfParserEngineAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mistral-ocr`.
   */
  public data object MistralOcr : InlineComponentsSchemasPdfParserEngineAnyOf0() {
    public override val `value`: String = "mistral-ocr"
  }

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : InlineComponentsSchemasPdfParserEngineAnyOf0() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `cloudflare-ai`.
   */
  public data object CloudflareAi : InlineComponentsSchemasPdfParserEngineAnyOf0() {
    public override val `value`: String = "cloudflare-ai"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPdfParserEngineAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPdfParserEngineAnyOf0 = when (value) {
      MistralOcr.value -> MistralOcr
      Native.value -> Native
      CloudflareAi.value -> CloudflareAi
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPdfParserEngineAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPdfParserEngineAnyOf0",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPdfParserEngineAnyOf0 = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPdfParserEngineAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
