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
 * /oneOf/1/properties/keep/anyOf/1/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/1/properties/keep/anyOf/1/properties/type
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48.Serializer::class)
public sealed class InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48 = when (value) {
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf2KeepAnyOf2TypeXfc61dd48) {
      encoder.encodeString(value.value)
    }
  }
}
