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
 * Output format. "json" (default) returns { text, usage }. "verbose_json" additionally returns task, language,
 * duration, and segment-level timestamps; only supported by OpenAI-compatible providers.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/STTRequest/properties/response_format
 */
@Serializable(with = InlineSttRequestResponseFormatX293f617e.Serializer::class)
public sealed class InlineSttRequestResponseFormatX293f617e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json`.
   */
  public data object Json : InlineSttRequestResponseFormatX293f617e() {
    public override val `value`: String = "json"
  }

  /**
   * Documented value. Wire value: `verbose_json`.
   */
  public data object VerboseJson : InlineSttRequestResponseFormatX293f617e() {
    public override val `value`: String = "verbose_json"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSttRequestResponseFormatX293f617e()

  public companion object {
    public fun fromValue(`value`: String): InlineSttRequestResponseFormatX293f617e = when (value) {
      Json.value -> Json
      VerboseJson.value -> VerboseJson
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSttRequestResponseFormatX293f617e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineSttRequestResponseFormatX293f617e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSttRequestResponseFormatX293f617e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSttRequestResponseFormatX293f617e) {
      encoder.encodeString(value.value)
    }
  }
}
