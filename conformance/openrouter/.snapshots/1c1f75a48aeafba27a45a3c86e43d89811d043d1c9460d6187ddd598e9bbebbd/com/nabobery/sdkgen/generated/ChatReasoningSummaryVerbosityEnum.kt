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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatReasoningSummaryVerbosityEnum.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatReasoningSummaryVerbosityEnum
 */
@Serializable(with = ChatReasoningSummaryVerbosityEnum.Serializer::class)
public sealed class ChatReasoningSummaryVerbosityEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : ChatReasoningSummaryVerbosityEnum() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `concise`.
   */
  public data object Concise : ChatReasoningSummaryVerbosityEnum() {
    public override val `value`: String = "concise"
  }

  /**
   * Documented value. Wire value: `detailed`.
   */
  public data object Detailed : ChatReasoningSummaryVerbosityEnum() {
    public override val `value`: String = "detailed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ChatReasoningSummaryVerbosityEnum()

  public companion object {
    public fun fromValue(`value`: String): ChatReasoningSummaryVerbosityEnum = when (value) {
      Auto.value -> Auto
      Concise.value -> Concise
      Detailed.value -> Detailed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ChatReasoningSummaryVerbosityEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ChatReasoningSummaryVerbosityEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ChatReasoningSummaryVerbosityEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ChatReasoningSummaryVerbosityEnum) {
      encoder.encodeString(value.value)
    }
  }
}
