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
 * The status of the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.transaction/properties/status
 */
@Serializable(with = InlineFinancialConnectionsTransactionStatusXa15a6333.Serializer::class)
public sealed class InlineFinancialConnectionsTransactionStatusXa15a6333 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineFinancialConnectionsTransactionStatusXa15a6333() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineFinancialConnectionsTransactionStatusXa15a6333() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `void`.
   */
  public data object Void : InlineFinancialConnectionsTransactionStatusXa15a6333() {
    public override val `value`: String = "void"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsTransactionStatusXa15a6333()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsTransactionStatusXa15a6333 = when (value) {
      Pending.value -> Pending
      Posted.value -> Posted
      Void.value -> Void
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsTransactionStatusXa15a6333> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsTransactionStatusXa15a6333", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsTransactionStatusXa15a6333 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsTransactionStatusXa15a6333) {
      encoder.encodeString(value.value)
    }
  }
}
