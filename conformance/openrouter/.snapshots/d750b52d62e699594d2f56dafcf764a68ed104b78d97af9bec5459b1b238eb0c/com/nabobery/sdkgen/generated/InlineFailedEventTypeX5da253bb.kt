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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FailedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FailedEvent/properties/type
 */
@Serializable(with = InlineFailedEventTypeX5da253bb.Serializer::class)
public sealed class InlineFailedEventTypeX5da253bb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.failed`.
   */
  public data object ResponseFailed : InlineFailedEventTypeX5da253bb() {
    public override val `value`: String = "response.failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFailedEventTypeX5da253bb()

  public companion object {
    public fun fromValue(`value`: String): InlineFailedEventTypeX5da253bb = when (value) {
      ResponseFailed.value -> ResponseFailed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFailedEventTypeX5da253bb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFailedEventTypeX5da253bb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFailedEventTypeX5da253bb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFailedEventTypeX5da253bb) {
      encoder.encodeString(value.value)
    }
  }
}
