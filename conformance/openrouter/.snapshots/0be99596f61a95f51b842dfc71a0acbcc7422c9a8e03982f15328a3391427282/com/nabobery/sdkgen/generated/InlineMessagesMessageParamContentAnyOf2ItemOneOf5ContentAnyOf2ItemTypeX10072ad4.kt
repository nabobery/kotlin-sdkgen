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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items/anyOf/2/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items/anyOf/2/properties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_reference`.
   */
  public data object ToolReference : InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4() {
    public override val `value`: String = "tool_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4 = when (value) {
      ToolReference.value -> ToolReference
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4) {
      encoder.encodeString(value.value)
    }
  }
}
