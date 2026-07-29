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
 * The status of the mandate on the Bacs network. Can be one of `pending`, `revoked`, `refused`, or `accepted`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_bacs_debit/properties/network_status
 */
@Serializable(with = InlineMandateBacsDebitNetworkStatusX024d6c22.Serializer::class)
public sealed class InlineMandateBacsDebitNetworkStatusX024d6c22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `accepted`.
   */
  public data object Accepted : InlineMandateBacsDebitNetworkStatusX024d6c22() {
    public override val `value`: String = "accepted"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineMandateBacsDebitNetworkStatusX024d6c22() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `refused`.
   */
  public data object Refused : InlineMandateBacsDebitNetworkStatusX024d6c22() {
    public override val `value`: String = "refused"
  }

  /**
   * Documented value. Wire value: `revoked`.
   */
  public data object Revoked : InlineMandateBacsDebitNetworkStatusX024d6c22() {
    public override val `value`: String = "revoked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateBacsDebitNetworkStatusX024d6c22()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateBacsDebitNetworkStatusX024d6c22 = when (value) {
      Accepted.value -> Accepted
      Pending.value -> Pending
      Refused.value -> Refused
      Revoked.value -> Revoked
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMandateBacsDebitNetworkStatusX024d6c22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandateBacsDebitNetworkStatusX024d6c22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateBacsDebitNetworkStatusX024d6c22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateBacsDebitNetworkStatusX024d6c22) {
      encoder.encodeString(value.value)
    }
  }
}
