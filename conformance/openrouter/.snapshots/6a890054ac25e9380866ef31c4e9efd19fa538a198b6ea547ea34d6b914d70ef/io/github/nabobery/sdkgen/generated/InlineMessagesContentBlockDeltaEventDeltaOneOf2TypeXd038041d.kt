package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/1/properties/t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/1/properties/t
 * ype
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d.Serializer::class)
public sealed class InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_json_delta`.
   */
  public data object InputJsonDelta : InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d() {
    public override val `value`: String = "input_json_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d = when (value) {
      InputJsonDelta.value -> InputJsonDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d) {
      encoder.encodeString(value.value)
    }
  }
}
