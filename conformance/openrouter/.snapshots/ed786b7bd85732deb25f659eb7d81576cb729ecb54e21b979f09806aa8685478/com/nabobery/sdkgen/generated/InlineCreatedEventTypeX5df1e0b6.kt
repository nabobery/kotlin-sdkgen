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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CreatedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreatedEvent/properties/type
 */
@Serializable(with = InlineCreatedEventTypeX5df1e0b6.Serializer::class)
public sealed class InlineCreatedEventTypeX5df1e0b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.created`.
   */
  public data object ResponseCreated : InlineCreatedEventTypeX5df1e0b6() {
    public override val `value`: String = "response.created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreatedEventTypeX5df1e0b6()

  public companion object {
    public fun fromValue(`value`: String): InlineCreatedEventTypeX5df1e0b6 = when (value) {
      ResponseCreated.value -> ResponseCreated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreatedEventTypeX5df1e0b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCreatedEventTypeX5df1e0b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreatedEventTypeX5df1e0b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreatedEventTypeX5df1e0b6) {
      encoder.encodeString(value.value)
    }
  }
}
