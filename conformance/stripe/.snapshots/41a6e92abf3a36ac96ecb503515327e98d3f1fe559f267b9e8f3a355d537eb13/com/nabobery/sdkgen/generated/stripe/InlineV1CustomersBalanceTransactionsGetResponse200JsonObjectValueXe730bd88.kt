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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/get/responses/200/content/appli
 * cation~1json/schema/properties/object
 */
@Serializable(with = InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88.Serializer::class)
public sealed class InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBalanceTransactionsGetResponse200JsonObjectValueXe730bd88) {
      encoder.encodeString(value.value)
    }
  }
}
