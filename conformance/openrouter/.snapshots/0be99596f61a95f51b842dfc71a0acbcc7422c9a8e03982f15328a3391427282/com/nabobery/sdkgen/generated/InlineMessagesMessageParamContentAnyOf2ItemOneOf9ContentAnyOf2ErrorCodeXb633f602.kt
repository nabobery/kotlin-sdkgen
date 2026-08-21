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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content/anyOf/1/properties/error_code.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content/anyOf/1/properties/error_code
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `max_uses_exceeded`.
   */
  public data object MaxUsesExceeded : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602() {
    public override val `value`: String = "max_uses_exceeded"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `query_too_long`.
   */
  public data object QueryTooLong : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602() {
    public override val `value`: String = "query_too_long"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602 = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      MaxUsesExceeded.value -> MaxUsesExceeded
      TooManyRequests.value -> TooManyRequests
      QueryTooLong.value -> QueryTooLong
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602) {
      encoder.encodeString(value.value)
    }
  }
}
