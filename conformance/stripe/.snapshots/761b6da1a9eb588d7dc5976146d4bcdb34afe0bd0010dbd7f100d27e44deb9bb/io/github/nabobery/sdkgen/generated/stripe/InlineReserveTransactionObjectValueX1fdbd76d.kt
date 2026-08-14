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
 * Source: sdkgen://source/openapi.json#/components/schemas/reserve_transaction/properties/object
 */
@Serializable(with = InlineReserveTransactionObjectValueX1fdbd76d.Serializer::class)
public sealed class InlineReserveTransactionObjectValueX1fdbd76d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reserve_transaction`.
   */
  public data object ReserveTransaction : InlineReserveTransactionObjectValueX1fdbd76d() {
    public override val `value`: String = "reserve_transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReserveTransactionObjectValueX1fdbd76d()

  public companion object {
    public fun fromValue(`value`: String): InlineReserveTransactionObjectValueX1fdbd76d = when (value) {
      ReserveTransaction.value -> ReserveTransaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReserveTransactionObjectValueX1fdbd76d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineReserveTransactionObjectValueX1fdbd76d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReserveTransactionObjectValueX1fdbd76d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReserveTransactionObjectValueX1fdbd76d) {
      encoder.encodeString(value.value)
    }
  }
}
