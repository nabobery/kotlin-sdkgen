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
 * The method used to send this payout, which is `standard` or `instant`. We support `instant` for payouts to debit
 * cards and bank accounts in certain countries. Learn more about [bank support for Instant
 * Payouts](https://stripe.com/docs/payouts/instant-payouts-banks).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payouts/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/method
 */
@Serializable(with = InlineV1PayoutsPostRequestFormMethodXb57a053f.Serializer::class)
public sealed class InlineV1PayoutsPostRequestFormMethodXb57a053f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineV1PayoutsPostRequestFormMethodXb57a053f() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1PayoutsPostRequestFormMethodXb57a053f() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PayoutsPostRequestFormMethodXb57a053f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PayoutsPostRequestFormMethodXb57a053f = when (value) {
      Instant.value -> Instant
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PayoutsPostRequestFormMethodXb57a053f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PayoutsPostRequestFormMethodXb57a053f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PayoutsPostRequestFormMethodXb57a053f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PayoutsPostRequestFormMethodXb57a053f) {
      encoder.encodeString(value.value)
    }
  }
}
