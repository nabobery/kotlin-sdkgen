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
 * The status of the paynow payments capability of the account, or whether the account can directly process paynow
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/paynow_payments
 */
@Serializable(with = InlineAccountCapabilitiesPaynowPaymentsXdce3eda9.Serializer::class)
public sealed class InlineAccountCapabilitiesPaynowPaymentsXdce3eda9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesPaynowPaymentsXdce3eda9() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesPaynowPaymentsXdce3eda9() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesPaynowPaymentsXdce3eda9() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesPaynowPaymentsXdce3eda9()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesPaynowPaymentsXdce3eda9 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesPaynowPaymentsXdce3eda9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesPaynowPaymentsXdce3eda9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesPaynowPaymentsXdce3eda9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesPaynowPaymentsXdce3eda9) {
      encoder.encodeString(value.value)
    }
  }
}
