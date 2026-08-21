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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/responses/200/content/application~1json/s
 * chema/properties/object
 */
@Serializable(with = InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee.Serializer::class)
public sealed class InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryTransactionEntriesGetResponse200JsonObjectValueXf793a2ee) {
      encoder.encodeString(value.value)
    }
  }
}
