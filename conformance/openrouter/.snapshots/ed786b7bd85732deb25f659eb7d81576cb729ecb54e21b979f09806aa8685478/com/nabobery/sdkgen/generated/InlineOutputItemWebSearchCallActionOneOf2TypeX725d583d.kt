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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/1/properties/type
 */
@Serializable(with = InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d.Serializer::class)
public sealed class InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open_page`.
   */
  public data object OpenPage : InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d() {
    public override val `value`: String = "open_page"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d = when (value) {
      OpenPage.value -> OpenPage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d) {
      encoder.encodeString(value.value)
    }
  }
}
