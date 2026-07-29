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
 * Transaction type of the mandate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_acss_debit/properties/transaction_type
 */
@Serializable(with = InlineMandateAcssDebitTransactionTypeXaf9f9ebd.Serializer::class)
public sealed class InlineMandateAcssDebitTransactionTypeXaf9f9ebd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineMandateAcssDebitTransactionTypeXaf9f9ebd() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineMandateAcssDebitTransactionTypeXaf9f9ebd() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateAcssDebitTransactionTypeXaf9f9ebd()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateAcssDebitTransactionTypeXaf9f9ebd = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMandateAcssDebitTransactionTypeXaf9f9ebd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandateAcssDebitTransactionTypeXaf9f9ebd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateAcssDebitTransactionTypeXaf9f9ebd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateAcssDebitTransactionTypeXaf9f9ebd) {
      encoder.encodeString(value.value)
    }
  }
}
