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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesAdvisorToolResultBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesAdvisorToolResultBlock/properties/type
 */
@Serializable(with = InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc.Serializer::class)
public sealed class InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_tool_result`.
   */
  public data object AdvisorToolResult : InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc() {
    public override val `value`: String = "advisor_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc = when (value) {
      AdvisorToolResult.value -> AdvisorToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc) {
      encoder.encodeString(value.value)
    }
  }
}
