package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/process_config/properties/allow_redisplay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/process_config/properties/allow_redisplay
 */
@Serializable(with = InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd.Serializer::class)
public sealed class InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersProe407PostRequestFormAllowRedisplayX678ec0cd) {
      encoder.encodeString(value.value)
    }
  }
}
