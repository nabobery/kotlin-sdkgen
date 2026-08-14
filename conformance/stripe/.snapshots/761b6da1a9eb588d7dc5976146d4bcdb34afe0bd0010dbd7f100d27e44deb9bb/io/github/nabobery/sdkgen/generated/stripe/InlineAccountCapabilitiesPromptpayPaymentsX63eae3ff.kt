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
 * The status of the promptpay payments capability of the account, or whether the account can directly process promptpay
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/promptpay_payments
 */
@Serializable(with = InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff.Serializer::class)
public sealed class InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff) {
      encoder.encodeString(value.value)
    }
  }
}
