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
 */
@Serializable(with = InlineComponentsSchemasSttRequestPropertiesResponseFormat.Serializer::class)
public sealed class InlineComponentsSchemasSttRequestPropertiesResponseFormat {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json`.
   */
  public data object Json : InlineComponentsSchemasSttRequestPropertiesResponseFormat() {
    public override val `value`: String = "json"
  }

  /**
   * Documented value. Wire value: `verbose_json`.
   */
  public data object VerboseJson : InlineComponentsSchemasSttRequestPropertiesResponseFormat() {
    public override val `value`: String = "verbose_json"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasSttRequestPropertiesResponseFormat()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasSttRequestPropertiesResponseFormat = when (value) {
      Json.value -> Json
      VerboseJson.value -> VerboseJson
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSttRequestPropertiesResponseFormat> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasSttRequestPropertiesResponseFormat", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSttRequestPropertiesResponseFormat =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasSttRequestPropertiesResponseFormat) {
      encoder.encodeString(value.value)
    }
  }
}
