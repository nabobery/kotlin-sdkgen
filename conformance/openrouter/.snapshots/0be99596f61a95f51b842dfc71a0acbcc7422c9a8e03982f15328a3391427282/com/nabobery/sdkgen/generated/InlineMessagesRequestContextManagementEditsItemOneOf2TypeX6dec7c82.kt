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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/type
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82.Serializer::class)
public sealed class InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `clear_thinking_20251015`.
   */
  public data object ClearThinking20251015 : InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82() {
    public override val `value`: String = "clear_thinking_20251015"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82 = when (value) {
      ClearThinking20251015.value -> ClearThinking20251015
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf2TypeX6dec7c82) {
      encoder.encodeString(value.value)
    }
  }
}
