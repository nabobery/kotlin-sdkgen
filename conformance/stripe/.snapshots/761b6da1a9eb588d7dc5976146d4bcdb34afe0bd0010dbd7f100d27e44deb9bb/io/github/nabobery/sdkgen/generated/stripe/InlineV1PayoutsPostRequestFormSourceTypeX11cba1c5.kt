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
 * The balance type of your Stripe balance to draw this payout from. Balances for different payment sources are kept
 * separately. You can find the amounts with the Balances API. One of `bank_account`, `card`, or `fpx`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payouts/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/source_type
 */
@Serializable(with = InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5.Serializer::class)
public sealed class InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5() {
    public override val `value`: String = "bank_account"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5() {
    public override val `value`: String = "fpx"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5 = when (value) {
      BankAccount.value -> BankAccount
      Card.value -> Card
      Fpx.value -> Fpx
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5) {
      encoder.encodeString(value.value)
    }
  }
}
