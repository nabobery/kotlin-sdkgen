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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/7/proper
 * ties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/7/proper
 * ties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `server_tool_use`.
   */
  public data object ServerToolUse : InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68() {
    public override val `value`: String = "server_tool_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68 = when (value) {
      ServerToolUse.value -> ServerToolUse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68) {
      encoder.encodeString(value.value)
    }
  }
}
