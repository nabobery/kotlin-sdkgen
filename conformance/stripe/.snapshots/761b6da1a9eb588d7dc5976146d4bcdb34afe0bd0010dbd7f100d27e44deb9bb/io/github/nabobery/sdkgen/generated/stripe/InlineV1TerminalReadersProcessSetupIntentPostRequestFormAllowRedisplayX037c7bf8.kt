package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
 * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
 * payment method in a checkout flow.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_setup_intent/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/allow_redisplay
 */
@Serializable(with = InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8.Serializer::class)
public sealed class InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8) {
      encoder.encodeString(value.value)
    }
  }
}
