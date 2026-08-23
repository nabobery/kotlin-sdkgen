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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/content_block/anyOf/14/pro
 * perties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/content_block/anyOf/14/pro
 * perties/type
 */
@Serializable(with = InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138.Serializer::class)
public sealed class InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138 = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockStartEventContentBlockAnyOf15TypeX2e876138) {
      encoder.encodeString(value.value)
    }
  }
}
