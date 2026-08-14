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
 * Status of the ReceivedDebit. ReceivedDebits are created with a status of either `succeeded` (approved) or `failed`
 * (declined). The failure reason can be found under the `failure_code`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit/properties/status
 */
@Serializable(with = InlineTreasuryReceivedDebitStatusXdf22d6dc.Serializer::class)
public sealed class InlineTreasuryReceivedDebitStatusXdf22d6dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTreasuryReceivedDebitStatusXdf22d6dc() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineTreasuryReceivedDebitStatusXdf22d6dc() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedDebitStatusXdf22d6dc()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedDebitStatusXdf22d6dc = when (value) {
      Failed.value -> Failed
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedDebitStatusXdf22d6dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedDebitStatusXdf22d6dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitStatusXdf22d6dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedDebitStatusXdf22d6dc) {
      encoder.encodeString(value.value)
    }
  }
}
