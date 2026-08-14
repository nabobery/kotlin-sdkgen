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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/type
 */
@Serializable(with = InlineOutputWebSearchServerToolItemTypeX86ed43d9.Serializer::class)
public sealed class InlineOutputWebSearchServerToolItemTypeX86ed43d9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_search`.
   */
  public data object OpenrouterWebSearch : InlineOutputWebSearchServerToolItemTypeX86ed43d9() {
    public override val `value`: String = "openrouter:web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputWebSearchServerToolItemTypeX86ed43d9()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputWebSearchServerToolItemTypeX86ed43d9 = when (value) {
      OpenrouterWebSearch.value -> OpenrouterWebSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputWebSearchServerToolItemTypeX86ed43d9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputWebSearchServerToolItemTypeX86ed43d9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputWebSearchServerToolItemTypeX86ed43d9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputWebSearchServerToolItemTypeX86ed43d9) {
      encoder.encodeString(value.value)
    }
  }
}
