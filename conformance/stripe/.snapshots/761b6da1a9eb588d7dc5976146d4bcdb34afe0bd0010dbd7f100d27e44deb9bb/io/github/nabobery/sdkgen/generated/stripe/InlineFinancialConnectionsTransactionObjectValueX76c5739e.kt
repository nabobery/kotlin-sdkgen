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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.transaction/properties/object
 */
@Serializable(with = InlineFinancialConnectionsTransactionObjectValueX76c5739e.Serializer::class)
public sealed class InlineFinancialConnectionsTransactionObjectValueX76c5739e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `financial_connections.transaction`.
   */
  public data object FinancialConnectionsTransaction : InlineFinancialConnectionsTransactionObjectValueX76c5739e() {
    public override val `value`: String = "financial_connections.transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsTransactionObjectValueX76c5739e()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsTransactionObjectValueX76c5739e = when (value) {
      FinancialConnectionsTransaction.value -> FinancialConnectionsTransaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsTransactionObjectValueX76c5739e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsTransactionObjectValueX76c5739e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsTransactionObjectValueX76c5739e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsTransactionObjectValueX76c5739e) {
      encoder.encodeString(value.value)
    }
  }
}
