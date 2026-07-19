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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesAdvisorToolResultBlock/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_tool_result`.
   */
  public data object AdvisorToolResult : InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType() {
    public override val `value`: String = "advisor_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType =
      when (value) {
      AdvisorToolResult.value -> AdvisorToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
