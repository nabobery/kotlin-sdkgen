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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/2/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/2/properties/type
 */
@Serializable(with = InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2.Serializer::class)
public sealed class InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `find_in_page`.
   */
  public data object FindInPage : InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2() {
    public override val `value`: String = "find_in_page"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2 = when (value) {
      FindInPage.value -> FindInPage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2) {
      encoder.encodeString(value.value)
    }
  }
}
