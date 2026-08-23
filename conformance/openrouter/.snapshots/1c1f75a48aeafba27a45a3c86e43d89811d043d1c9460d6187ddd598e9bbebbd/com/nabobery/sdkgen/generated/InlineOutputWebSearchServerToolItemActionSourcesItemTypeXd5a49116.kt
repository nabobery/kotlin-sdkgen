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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/sources/i
 * tems/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/sources/i
 * tems/properties/type
 */
@Serializable(with = InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116.Serializer::class)
public sealed class InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116 = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputWebSearchServerToolItemActionSourcesItemTypeXd5a49116) {
      encoder.encodeString(value.value)
    }
  }
}
