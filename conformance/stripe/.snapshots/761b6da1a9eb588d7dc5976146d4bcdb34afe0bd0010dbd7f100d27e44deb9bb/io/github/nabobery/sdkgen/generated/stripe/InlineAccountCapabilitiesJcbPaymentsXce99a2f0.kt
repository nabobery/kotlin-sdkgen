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
 * The status of the JCB payments capability of the account, or whether the account (Japan only) can directly process
 * JCB credit card charges in JPY currency.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/jcb_payments
 */
@Serializable(with = InlineAccountCapabilitiesJcbPaymentsXce99a2f0.Serializer::class)
public sealed class InlineAccountCapabilitiesJcbPaymentsXce99a2f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesJcbPaymentsXce99a2f0() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesJcbPaymentsXce99a2f0() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesJcbPaymentsXce99a2f0() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesJcbPaymentsXce99a2f0()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesJcbPaymentsXce99a2f0 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesJcbPaymentsXce99a2f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesJcbPaymentsXce99a2f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesJcbPaymentsXce99a2f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesJcbPaymentsXce99a2f0) {
      encoder.encodeString(value.value)
    }
  }
}
