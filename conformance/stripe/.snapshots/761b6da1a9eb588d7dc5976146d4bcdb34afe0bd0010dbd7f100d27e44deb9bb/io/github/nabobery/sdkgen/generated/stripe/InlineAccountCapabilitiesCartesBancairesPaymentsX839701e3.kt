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
 * The status of the Cartes Bancaires payments capability of the account, or whether the account can directly process
 * Cartes Bancaires card charges in EUR currency.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/cartes_bancaires_payments
 */
@Serializable(with = InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3.Serializer::class)
public sealed class InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3) {
      encoder.encodeString(value.value)
    }
  }
}
