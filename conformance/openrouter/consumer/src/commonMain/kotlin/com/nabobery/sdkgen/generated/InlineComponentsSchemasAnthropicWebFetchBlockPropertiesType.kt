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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchBlock/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_fetch_result`.
   */
  public data object WebFetchResult : InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType() {
    public override val `value`: String = "web_fetch_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType = when (value) {
      WebFetchResult.value -> WebFetchResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicWebFetchBlockPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
