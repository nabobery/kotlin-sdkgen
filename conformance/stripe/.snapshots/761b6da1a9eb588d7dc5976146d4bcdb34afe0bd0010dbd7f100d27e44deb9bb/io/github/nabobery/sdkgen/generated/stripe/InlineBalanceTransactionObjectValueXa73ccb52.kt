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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_transaction/properties/object
 */
@Serializable(with = InlineBalanceTransactionObjectValueXa73ccb52.Serializer::class)
public sealed class InlineBalanceTransactionObjectValueXa73ccb52 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balance_transaction`.
   */
  public data object BalanceTransaction : InlineBalanceTransactionObjectValueXa73ccb52() {
    public override val `value`: String = "balance_transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceTransactionObjectValueXa73ccb52()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceTransactionObjectValueXa73ccb52 = when (value) {
      BalanceTransaction.value -> BalanceTransaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceTransactionObjectValueXa73ccb52> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBalanceTransactionObjectValueXa73ccb52", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceTransactionObjectValueXa73ccb52 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceTransactionObjectValueXa73ccb52) {
      encoder.encodeString(value.value)
    }
  }
}
