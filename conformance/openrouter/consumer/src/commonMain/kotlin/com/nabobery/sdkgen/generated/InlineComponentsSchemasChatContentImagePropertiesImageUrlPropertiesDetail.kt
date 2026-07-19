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
 * Image detail level for vision models. `original` is an OpenRouter extension (not in the OpenAI Chat Completions spec)
 * requesting true original-resolution media; it is downgraded to `high` for providers that lack an original-resolution
 * tier.
 */
@Serializable(with = InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail.Serializer::class)
public sealed class InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `original`.
   */
  public data object Original : InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail() {
    public override val `value`: String = "original"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail =
      when (value) {
      Auto.value -> Auto
      Low.value -> Low
      High.value -> High
      Original.value -> Original
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasChatContentImagePropertiesImageUrlPropertiesDetail) {
      encoder.encodeString(value.value)
    }
  }
}
