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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction/properties/object
 */
@Serializable(with = InlineTreasuryTransactionObjectValueX0eec1401.Serializer::class)
public sealed class InlineTreasuryTransactionObjectValueX0eec1401 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.transaction`.
   */
  public data object TreasuryTransaction : InlineTreasuryTransactionObjectValueX0eec1401() {
    public override val `value`: String = "treasury.transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryTransactionObjectValueX0eec1401()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryTransactionObjectValueX0eec1401 = when (value) {
      TreasuryTransaction.value -> TreasuryTransaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryTransactionObjectValueX0eec1401> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionObjectValueX0eec1401", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionObjectValueX0eec1401 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionObjectValueX0eec1401) {
      encoder.encodeString(value.value)
    }
  }
}
