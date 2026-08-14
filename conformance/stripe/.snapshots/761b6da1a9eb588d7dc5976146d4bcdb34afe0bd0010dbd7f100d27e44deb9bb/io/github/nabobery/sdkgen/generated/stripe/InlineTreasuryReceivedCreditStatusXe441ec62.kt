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
 * Status of the ReceivedCredit. ReceivedCredits are created either `succeeded` (approved) or `failed` (declined). If a
 * ReceivedCredit is declined, the failure reason can be found in the `failure_code` field.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit/properties/status
 */
@Serializable(with = InlineTreasuryReceivedCreditStatusXe441ec62.Serializer::class)
public sealed class InlineTreasuryReceivedCreditStatusXe441ec62 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTreasuryReceivedCreditStatusXe441ec62() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineTreasuryReceivedCreditStatusXe441ec62() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedCreditStatusXe441ec62()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedCreditStatusXe441ec62 = when (value) {
      Failed.value -> Failed
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedCreditStatusXe441ec62> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedCreditStatusXe441ec62", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditStatusXe441ec62 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditStatusXe441ec62) {
      encoder.encodeString(value.value)
    }
  }
}
