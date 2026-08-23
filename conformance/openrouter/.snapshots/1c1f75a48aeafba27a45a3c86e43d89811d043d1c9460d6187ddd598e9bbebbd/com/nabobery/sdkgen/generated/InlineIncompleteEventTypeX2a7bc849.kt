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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/IncompleteEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/IncompleteEvent/properties/type
 */
@Serializable(with = InlineIncompleteEventTypeX2a7bc849.Serializer::class)
public sealed class InlineIncompleteEventTypeX2a7bc849 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.incomplete`.
   */
  public data object ResponseIncomplete : InlineIncompleteEventTypeX2a7bc849() {
    public override val `value`: String = "response.incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIncompleteEventTypeX2a7bc849()

  public companion object {
    public fun fromValue(`value`: String): InlineIncompleteEventTypeX2a7bc849 = when (value) {
      ResponseIncomplete.value -> ResponseIncomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIncompleteEventTypeX2a7bc849> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineIncompleteEventTypeX2a7bc849", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIncompleteEventTypeX2a7bc849 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIncompleteEventTypeX2a7bc849) {
      encoder.encodeString(value.value)
    }
  }
}
