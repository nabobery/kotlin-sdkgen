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
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account_ownership/properties/object
 */
@Serializable(with = InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7.Serializer::class)
public sealed class InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `financial_connections.account_ownership`.
   */
  public data object FinancialConnectionsAccountOwnership : InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7() {
    public override val `value`: String = "financial_connections.account_ownership"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7 = when (value) {
      FinancialConnectionsAccountOwnership.value -> FinancialConnectionsAccountOwnership
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7) {
      encoder.encodeString(value.value)
    }
  }
}
