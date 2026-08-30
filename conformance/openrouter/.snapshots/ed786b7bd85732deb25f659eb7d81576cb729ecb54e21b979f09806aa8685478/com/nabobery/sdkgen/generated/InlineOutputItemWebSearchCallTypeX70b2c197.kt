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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/type
 */
@Serializable(with = InlineOutputItemWebSearchCallTypeX70b2c197.Serializer::class)
public sealed class InlineOutputItemWebSearchCallTypeX70b2c197 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_call`.
   */
  public data object WebSearchCall : InlineOutputItemWebSearchCallTypeX70b2c197() {
    public override val `value`: String = "web_search_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemWebSearchCallTypeX70b2c197()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemWebSearchCallTypeX70b2c197 = when (value) {
      WebSearchCall.value -> WebSearchCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallTypeX70b2c197> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemWebSearchCallTypeX70b2c197", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallTypeX70b2c197 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallTypeX70b2c197) {
      encoder.encodeString(value.value)
    }
  }
}
