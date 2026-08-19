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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/object
 */
@Serializable(with = InlineBaseResponsesResultObjectValueXe17d26ee.Serializer::class)
public sealed class InlineBaseResponsesResultObjectValueXe17d26ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response`.
   */
  public data object Response : InlineBaseResponsesResultObjectValueXe17d26ee() {
    public override val `value`: String = "response"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseResponsesResultObjectValueXe17d26ee()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseResponsesResultObjectValueXe17d26ee = when (value) {
      Response.value -> Response
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseResponsesResultObjectValueXe17d26ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseResponsesResultObjectValueXe17d26ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseResponsesResultObjectValueXe17d26ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseResponsesResultObjectValueXe17d26ee) {
      encoder.encodeString(value.value)
    }
  }
}
