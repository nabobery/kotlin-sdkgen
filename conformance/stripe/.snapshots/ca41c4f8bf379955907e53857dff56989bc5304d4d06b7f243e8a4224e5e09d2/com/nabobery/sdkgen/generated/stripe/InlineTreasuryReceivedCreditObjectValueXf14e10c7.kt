package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit/properties/object
 */
@Serializable(with = InlineTreasuryReceivedCreditObjectValueXf14e10c7.Serializer::class)
public sealed class InlineTreasuryReceivedCreditObjectValueXf14e10c7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.received_credit`.
   */
  public data object TreasuryReceivedCredit : InlineTreasuryReceivedCreditObjectValueXf14e10c7() {
    public override val `value`: String = "treasury.received_credit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedCreditObjectValueXf14e10c7()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedCreditObjectValueXf14e10c7 = when (value) {
      TreasuryReceivedCredit.value -> TreasuryReceivedCredit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedCreditObjectValueXf14e10c7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedCreditObjectValueXf14e10c7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditObjectValueXf14e10c7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditObjectValueXf14e10c7) {
      encoder.encodeString(value.value)
    }
  }
}
