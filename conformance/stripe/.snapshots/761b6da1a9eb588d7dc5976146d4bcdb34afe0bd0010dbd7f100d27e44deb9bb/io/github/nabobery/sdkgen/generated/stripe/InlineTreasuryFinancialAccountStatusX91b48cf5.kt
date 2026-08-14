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
 * Status of this FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/status
 */
@Serializable(with = InlineTreasuryFinancialAccountStatusX91b48cf5.Serializer::class)
public sealed class InlineTreasuryFinancialAccountStatusX91b48cf5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineTreasuryFinancialAccountStatusX91b48cf5() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineTreasuryFinancialAccountStatusX91b48cf5() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountStatusX91b48cf5()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountStatusX91b48cf5 = when (value) {
      Closed.value -> Closed
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountStatusX91b48cf5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountStatusX91b48cf5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountStatusX91b48cf5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountStatusX91b48cf5) {
      encoder.encodeString(value.value)
    }
  }
}
