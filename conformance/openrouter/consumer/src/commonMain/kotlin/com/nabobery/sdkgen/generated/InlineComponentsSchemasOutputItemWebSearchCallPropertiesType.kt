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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemWebSearchCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_call`.
   */
  public data object WebSearchCall : InlineComponentsSchemasOutputItemWebSearchCallPropertiesType() {
    public override val `value`: String = "web_search_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemWebSearchCallPropertiesType = when (value) {
      WebSearchCall.value -> WebSearchCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemWebSearchCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
