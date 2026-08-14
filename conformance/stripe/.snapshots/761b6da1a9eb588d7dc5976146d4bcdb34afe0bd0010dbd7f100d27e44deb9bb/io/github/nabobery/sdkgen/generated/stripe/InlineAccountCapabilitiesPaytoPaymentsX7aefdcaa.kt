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
 * The status of the PayTo capability of the account, or whether the account can directly process PayTo charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/payto_payments
 */
@Serializable(with = InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa.Serializer::class)
public sealed class InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa) {
      encoder.encodeString(value.value)
    }
  }
}
