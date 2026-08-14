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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/linked_account_options_common/properties/permissions/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/linked_account_options_common/properties/permissions/items
 */
@Serializable(with = InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba.Serializer::class)
public sealed class InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba() {
    public override val `value`: String = "payment_method"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba()

  public companion object {
    public fun fromValue(`value`: String): InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      PaymentMethod.value -> PaymentMethod
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLinkedAccountOptionsCommonPermissionsItemX23a646ba) {
      encoder.encodeString(value.value)
    }
  }
}
