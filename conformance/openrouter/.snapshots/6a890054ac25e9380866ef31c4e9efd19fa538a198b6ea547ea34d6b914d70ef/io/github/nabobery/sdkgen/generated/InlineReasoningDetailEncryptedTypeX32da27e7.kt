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
 * sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailEncrypted/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailEncrypted/properties/type
 */
@Serializable(with = InlineReasoningDetailEncryptedTypeX32da27e7.Serializer::class)
public sealed class InlineReasoningDetailEncryptedTypeX32da27e7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.encrypted`.
   */
  public data object ReasoningEncrypted : InlineReasoningDetailEncryptedTypeX32da27e7() {
    public override val `value`: String = "reasoning.encrypted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReasoningDetailEncryptedTypeX32da27e7()

  public companion object {
    public fun fromValue(`value`: String): InlineReasoningDetailEncryptedTypeX32da27e7 = when (value) {
      ReasoningEncrypted.value -> ReasoningEncrypted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReasoningDetailEncryptedTypeX32da27e7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineReasoningDetailEncryptedTypeX32da27e7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReasoningDetailEncryptedTypeX32da27e7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReasoningDetailEncryptedTypeX32da27e7) {
      encoder.encodeString(value.value)
    }
  }
}
