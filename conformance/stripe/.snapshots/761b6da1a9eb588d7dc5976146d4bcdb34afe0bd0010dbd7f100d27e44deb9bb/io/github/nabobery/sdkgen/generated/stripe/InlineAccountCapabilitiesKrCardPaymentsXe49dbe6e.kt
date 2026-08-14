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
 * The status of the KrCard capability of the account, or whether the account can directly process KrCard payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/kr_card_payments
 */
@Serializable(with = InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e.Serializer::class)
public sealed class InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e) {
      encoder.encodeString(value.value)
    }
  }
}
