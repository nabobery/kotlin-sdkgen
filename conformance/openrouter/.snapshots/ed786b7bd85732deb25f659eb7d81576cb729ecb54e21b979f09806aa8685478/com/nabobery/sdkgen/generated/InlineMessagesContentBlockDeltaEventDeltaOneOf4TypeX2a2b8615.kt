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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/3/properties/t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/3/properties/t
 * ype
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615.Serializer::class)
public sealed class InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `signature_delta`.
   */
  public data object SignatureDelta : InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615() {
    public override val `value`: String = "signature_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615 = when (value) {
      SignatureDelta.value -> SignatureDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf4TypeX2a2b8615) {
      encoder.encodeString(value.value)
    }
  }
}
