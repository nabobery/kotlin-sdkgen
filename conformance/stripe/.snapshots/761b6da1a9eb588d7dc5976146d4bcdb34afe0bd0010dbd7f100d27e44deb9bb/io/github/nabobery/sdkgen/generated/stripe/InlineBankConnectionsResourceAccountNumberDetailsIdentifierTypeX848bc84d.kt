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
 * The type of account number associated with the account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_number_details/properties/identifi
 * er_type
 */
@Serializable(with = InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d.Serializer::class)
public sealed class InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_number`.
   */
  public data object AccountNumber : InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d() {
    public override val `value`: String = "account_number"
  }

  /**
   * Documented value. Wire value: `tokenized_account_number`.
   */
  public data object TokenizedAccountNumber : InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d() {
    public override val `value`: String = "tokenized_account_number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d = when (value) {
      AccountNumber.value -> AccountNumber
      TokenizedAccountNumber.value -> TokenizedAccountNumber
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d) {
      encoder.encodeString(value.value)
    }
  }
}
