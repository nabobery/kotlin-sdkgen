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
 * The status of the Satispay capability of the account, or whether the account can directly process Satispay payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/satispay_payments
 */
@Serializable(with = InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80.Serializer::class)
public sealed class InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80) {
      encoder.encodeString(value.value)
    }
  }
}
