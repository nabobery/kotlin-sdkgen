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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1owners/get/responses/200/conten
 * t/application~1json/schema/properties/object
 */
@Serializable(with = InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403.Serializer::class)
public sealed class InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonObjectValueXa1567403) {
      encoder.encodeString(value.value)
    }
  }
}
