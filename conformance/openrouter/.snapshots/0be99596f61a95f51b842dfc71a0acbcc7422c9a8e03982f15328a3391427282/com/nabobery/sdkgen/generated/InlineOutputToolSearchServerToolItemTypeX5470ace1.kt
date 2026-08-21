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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputToolSearchServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputToolSearchServerToolItem/properties/type
 */
@Serializable(with = InlineOutputToolSearchServerToolItemTypeX5470ace1.Serializer::class)
public sealed class InlineOutputToolSearchServerToolItemTypeX5470ace1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:tool_search`.
   */
  public data object OpenrouterToolSearch : InlineOutputToolSearchServerToolItemTypeX5470ace1() {
    public override val `value`: String = "openrouter:tool_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputToolSearchServerToolItemTypeX5470ace1()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputToolSearchServerToolItemTypeX5470ace1 = when (value) {
      OpenrouterToolSearch.value -> OpenrouterToolSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputToolSearchServerToolItemTypeX5470ace1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputToolSearchServerToolItemTypeX5470ace1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputToolSearchServerToolItemTypeX5470ace1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputToolSearchServerToolItemTypeX5470ace1) {
      encoder.encodeString(value.value)
    }
  }
}
