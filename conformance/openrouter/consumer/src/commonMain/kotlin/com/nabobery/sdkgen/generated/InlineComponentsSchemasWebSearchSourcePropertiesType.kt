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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchSource/properties/type.
 */
@Serializable(with = InlineComponentsSchemasWebSearchSourcePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasWebSearchSourcePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineComponentsSchemasWebSearchSourcePropertiesType() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebSearchSourcePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebSearchSourcePropertiesType = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchSourcePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebSearchSourcePropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchSourcePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebSearchSourcePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
