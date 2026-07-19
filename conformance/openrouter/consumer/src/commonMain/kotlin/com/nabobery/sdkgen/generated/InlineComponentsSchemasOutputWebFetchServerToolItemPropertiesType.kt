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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebFetchServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_fetch`.
   */
  public data object OpenrouterWebFetch : InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:web_fetch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType =
      when (value) {
      OpenrouterWebFetch.value -> OpenrouterWebFetch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputWebFetchServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
