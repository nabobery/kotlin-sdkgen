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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.debit_reversal/properties/object
 */
@Serializable(with = InlineTreasuryDebitReversalObjectValueX1c7455c5.Serializer::class)
public sealed class InlineTreasuryDebitReversalObjectValueX1c7455c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.debit_reversal`.
   */
  public data object TreasuryDebitReversal : InlineTreasuryDebitReversalObjectValueX1c7455c5() {
    public override val `value`: String = "treasury.debit_reversal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryDebitReversalObjectValueX1c7455c5()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryDebitReversalObjectValueX1c7455c5 = when (value) {
      TreasuryDebitReversal.value -> TreasuryDebitReversal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryDebitReversalObjectValueX1c7455c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryDebitReversalObjectValueX1c7455c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryDebitReversalObjectValueX1c7455c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryDebitReversalObjectValueX1c7455c5) {
      encoder.encodeString(value.value)
    }
  }
}
