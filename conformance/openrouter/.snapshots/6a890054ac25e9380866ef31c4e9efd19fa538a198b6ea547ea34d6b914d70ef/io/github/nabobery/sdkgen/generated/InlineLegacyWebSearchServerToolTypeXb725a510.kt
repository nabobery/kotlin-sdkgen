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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/Legacy_WebSearchServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Legacy_WebSearchServerTool/properties/type
 */
@Serializable(with = InlineLegacyWebSearchServerToolTypeXb725a510.Serializer::class)
public sealed class InlineLegacyWebSearchServerToolTypeXb725a510 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search`.
   */
  public data object WebSearch : InlineLegacyWebSearchServerToolTypeXb725a510() {
    public override val `value`: String = "web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLegacyWebSearchServerToolTypeXb725a510()

  public companion object {
    public fun fromValue(`value`: String): InlineLegacyWebSearchServerToolTypeXb725a510 = when (value) {
      WebSearch.value -> WebSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLegacyWebSearchServerToolTypeXb725a510> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineLegacyWebSearchServerToolTypeXb725a510", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLegacyWebSearchServerToolTypeXb725a510 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLegacyWebSearchServerToolTypeXb725a510) {
      encoder.encodeString(value.value)
    }
  }
}
