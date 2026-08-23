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
 * The `type` of the balance. An additional hash is included on the balance with a name matching this value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_balance/properties/type
 */
@Serializable(with = InlineBankConnectionsResourceBalanceTypeX335d46c9.Serializer::class)
public sealed class InlineBankConnectionsResourceBalanceTypeX335d46c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cash`.
   */
  public data object Cash : InlineBankConnectionsResourceBalanceTypeX335d46c9() {
    public override val `value`: String = "cash"
  }

  /**
   * Documented value. Wire value: `credit`.
   */
  public data object Credit : InlineBankConnectionsResourceBalanceTypeX335d46c9() {
    public override val `value`: String = "credit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResourceBalanceTypeX335d46c9()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResourceBalanceTypeX335d46c9 = when (value) {
      Cash.value -> Cash
      Credit.value -> Credit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResourceBalanceTypeX335d46c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceBalanceTypeX335d46c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceBalanceTypeX335d46c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceBalanceTypeX335d46c9) {
      encoder.encodeString(value.value)
    }
  }
}
