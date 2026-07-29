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
 * The status of the last refresh attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_transaction_refresh/properties/status
 */
@Serializable(with = InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432.Serializer::class)
public sealed class InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432 = when (value) {
      Failed.value -> Failed
      Pending.value -> Pending
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432) {
      encoder.encodeString(value.value)
    }
  }
}
