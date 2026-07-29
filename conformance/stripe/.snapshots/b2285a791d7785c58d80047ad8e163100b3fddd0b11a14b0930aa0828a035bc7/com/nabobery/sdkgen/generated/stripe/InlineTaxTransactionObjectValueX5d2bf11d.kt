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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/object
 */
@Serializable(with = InlineTaxTransactionObjectValueX5d2bf11d.Serializer::class)
public sealed class InlineTaxTransactionObjectValueX5d2bf11d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax.transaction`.
   */
  public data object TaxTransaction : InlineTaxTransactionObjectValueX5d2bf11d() {
    public override val `value`: String = "tax.transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxTransactionObjectValueX5d2bf11d()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxTransactionObjectValueX5d2bf11d = when (value) {
      TaxTransaction.value -> TaxTransaction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxTransactionObjectValueX5d2bf11d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxTransactionObjectValueX5d2bf11d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxTransactionObjectValueX5d2bf11d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionObjectValueX5d2bf11d) {
      encoder.encodeString(value.value)
    }
  }
}
