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
 * The status of the RevolutPay capability of the account, or whether the account can directly process RevolutPay
 * payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/revolut_pay_payments
 */
@Serializable(with = InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94.Serializer::class)
public sealed class InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94) {
      encoder.encodeString(value.value)
    }
  }
}
