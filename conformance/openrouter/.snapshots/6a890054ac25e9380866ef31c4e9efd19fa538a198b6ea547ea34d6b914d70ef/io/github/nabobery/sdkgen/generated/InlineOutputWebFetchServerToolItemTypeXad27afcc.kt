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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebFetchServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputWebFetchServerToolItem/properties/type
 */
@Serializable(with = InlineOutputWebFetchServerToolItemTypeXad27afcc.Serializer::class)
public sealed class InlineOutputWebFetchServerToolItemTypeXad27afcc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_fetch`.
   */
  public data object OpenrouterWebFetch : InlineOutputWebFetchServerToolItemTypeXad27afcc() {
    public override val `value`: String = "openrouter:web_fetch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputWebFetchServerToolItemTypeXad27afcc()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputWebFetchServerToolItemTypeXad27afcc = when (value) {
      OpenrouterWebFetch.value -> OpenrouterWebFetch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputWebFetchServerToolItemTypeXad27afcc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputWebFetchServerToolItemTypeXad27afcc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputWebFetchServerToolItemTypeXad27afcc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputWebFetchServerToolItemTypeXad27afcc) {
      encoder.encodeString(value.value)
    }
  }
}
