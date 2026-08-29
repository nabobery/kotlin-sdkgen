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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebFetchServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebFetchServerTool/properties/type
 */
@Serializable(with = InlineWebFetchServerToolTypeX0b01fb42.Serializer::class)
public sealed class InlineWebFetchServerToolTypeX0b01fb42 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_fetch`.
   */
  public data object OpenrouterWebFetch : InlineWebFetchServerToolTypeX0b01fb42() {
    public override val `value`: String = "openrouter:web_fetch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebFetchServerToolTypeX0b01fb42()

  public companion object {
    public fun fromValue(`value`: String): InlineWebFetchServerToolTypeX0b01fb42 = when (value) {
      OpenrouterWebFetch.value -> OpenrouterWebFetch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebFetchServerToolTypeX0b01fb42> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineWebFetchServerToolTypeX0b01fb42", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebFetchServerToolTypeX0b01fb42 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebFetchServerToolTypeX0b01fb42) {
      encoder.encodeString(value.value)
    }
  }
}
